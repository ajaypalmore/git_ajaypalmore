/*package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_already_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
	}

	@When("^title of login page is Free CRM$")
	public void title_login_page_free_CRM() {
		String title = driver.getTitle();
		System.out.println("Title Page::::::::>>>>>> " + title);

		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}

	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username , String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on Login Button$")
	public void user_clicks_on_Login_Button() {
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
	}

	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		String title = driver.getTitle();
		System.out.println("Home Page Title ::::::::>>>>>> " + title);
		Assert.assertEquals("CRMPRO", title);
	}
	
	@Then("^Close the browser$")
	public void close_the_browser(){
		 driver.quit();
	 }
	
}
*/