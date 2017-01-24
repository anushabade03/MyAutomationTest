import org.junit.Test;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.table.TableConverter;

public class LogInTest {

	WebDriver driver;
	String uname;
	String pwd;

	@Given("^Login to fb with correct  \"([^\"]*)\"$")
	public void login_to_fb_with_correct(String BrowserName) throws Throwable {

		System.out.println(BrowserName);
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:/javaTraining/ws/CallBy/lib/chromedriver.exe"); driver = new
		 * ChromeDriver(); driver.get(BrowserName);
		 */

	}

	@When("^Enter the \"([^\"]*)\" into the att login page$")
	public void enter_the_into_the_att_login_page(String userCredendials) throws Throwable {

		System.out.println(userCredendials);
		/*
		 * System.out.println(driver.getTitle()); StringTokenizer st = new
		 * StringTokenizer(userCredendials, ","); while (st.hasMoreTokens()) {
		 * uname =st.nextToken(); pwd = st.nextToken(); }
		 * 
		 * driver.findElement(By.xpath("//*[@id='ge5p_z2-user-auth']/span")).
		 * click();
		 */

	}

	@Then("^successfully login and  display the att home page$")
	public void successfully_login_and_display_the_att_home_page() throws Throwable {
		System.out.println("then");

		/*
		 * driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(uname);
		 * driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
		 * driver.findElement(By.xpath("//*[@id='loginButton']")).click();
		 */
	}

	@Then("^get the title of the homepage$")
	public void get_the_title_of_the_homepage() throws Throwable {
		// System.out.println(driver.getTitle());
	}

	@Given("^a blog post named \"([^\"]*)\" with Markdown body$")
	public void a_blog_post_named_with_Markdown_body(String st1, String st2) throws Throwable {
		System.out.println(st1 + "   " + st2);
	}

	@Given("^the following users exist:$")
	public void the_following_users_exist(DataTable userTable) throws Throwable {
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

		// implementing Raw
		/*
		 * List<List<String>> UserTableRaw = userTable.raw();
		 * 
		 * int rowSize = UserTableRaw.size(); for(int i=0;i<rowSize;i++) {
		 * List<String> Rows = UserTableRaw.get(i); Iterator<String> RowIterator
		 * = Rows.iterator(); while(RowIterator.hasNext()) {
		 * System.out.println(RowIterator.next()); } }
		 * 
		 */

		// GherkinRow implementation
		/*
		 * List<DataTableRow> gherkinRows = userTable.getGherkinRows();
		 * 
		 * for (DataTableRow eachRow : gherkinRows) { List<String> cells =
		 * eachRow.getCells(); for (String column : cells) {
		 * System.out.println(column); } }
		 */

		// topcells
		/*
		 * List<String> topCells = userTable.topCells(); Iterator<String>
		 * iterator = topCells.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		// table converter

		TableConverter tableConverter = userTable.getTableConverter();

	}

	@Test
	public void testLoginText() {

	}

}
