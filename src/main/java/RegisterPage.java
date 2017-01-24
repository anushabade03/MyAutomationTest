import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
	
	static WebDriver driver;

	
	
	public  WebElement userNameElement(){
		return driver.findElement(By.xpath("//input[@id='ap_customer_name']"));	
	
	}
	
	public  WebElement emailElement(){
		return driver.findElement(By.xpath("//input[@id='ap_email']"));	
	
	}
	
	public  WebElement pwdElement(){
		return driver.findElement(By.xpath("//input[@id='ap_password']"));	
	
	}
	
	public  WebElement pwdChkElement(){
		return driver.findElement(By.xpath("//input[@id='ap_password_check']"));	
	
	}
	
	public  WebElement createUserElement(){
		return driver.findElement(By.xpath("//*[@id='continue']"));	
	
	}	
	
	
	
}
