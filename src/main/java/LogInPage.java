import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LogInPage {

	WebDriver driver;
	
	public void BaseMethod(){
		
		System.setProperty("webdriver.chrome.driver",  "C:/javaTraining/ws/CallBy/lib/chromedriver.exe");
		driver = new ChromeDriver();
		
		}
	
	public void logInBase(){
		BaseMethod();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions mouse = new Actions(driver);
		
		//signIn Element
		WebElement signInElement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		mouse.moveToElement(signInElement).build().perform();
		
		
		
		
		//register link
		
	    WebElement NewUserElement= driver.findElement(By.xpath("//*[@id='nav-flyout-ya-newCust']/a"));
		mouse.moveToElement(NewUserElement).click().build().perform();
		
		 //WebDriverWait webwait = new WebDriverWait(driver, 10);
        // By locator = By.xpath("//*[@id='ap_register_form']/div/div/h1");	
		//webwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}
	
	
}
