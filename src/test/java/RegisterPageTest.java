import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegisterPageTest {

	WebDriver driver;
	String userName;
	String email;
	String pwd;
	String pwdchk;
@Given("^the following RegUsers exist:$")
public void the_following_RegUsers_exist(DataTable UserDataTable)  {
 
    List<List<String>> UserTableRaw = UserDataTable.raw();
	
	int rowSize = UserTableRaw.size();
	for(int i=0;i<rowSize;i++)
	{
		List<String> Rows = UserTableRaw.get(i);
	    Iterator<String> RowIterator = Rows.iterator();
	    
	    	userName= RowIterator.next();
	    	email=RowIterator.next();
	    	pwd=RowIterator.next();
	    	pwdchk=RowIterator.next();
	   
	}
	
}

@When("^Ente the userDetails in the RegisterPage$")
public void ente_the_userDetails_in_the_RegisterPage()  {
	
	//click on login
	LogInPage login = new LogInPage();
	//login.BaseMethod();
	login.logInBase();
	
	//go to registerPage
	RegisterPage rpg = new RegisterPage();
	rpg.userNameElement().sendKeys(userName);
	rpg.emailElement().sendKeys(email);
	rpg.pwdElement().sendKeys(pwd);
	rpg.pwdChkElement().sendKeys(pwdchk);
	rpg.createUserElement().click();
	
}

@Then("^the user shud get registered successfully$")
public void the_user_shud_get_registered_successfully()  {
 
    String pageName ="Hello, "+userName; 	
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]")).getText().equals(pageName));
	
}



}
