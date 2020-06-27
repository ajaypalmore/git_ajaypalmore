package com.qa.stepDefinations;



import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.utils.TestBase;
import com.qa.utils.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase   {
	LoginPage loginPage;
	HomePage homepage;
	TestUtil testUtil;
	
	@Given("^Open the browser$")
	public void open_the_browser()  {
		TestBase.initizatalion();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page()  {
		loginPage = new LoginPage();
		String strTitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", strTitle);
	}

	@Then("^user log into app$")
	public void user_enter_username_and_password()  {
		homepage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Then("^Validates home page title$")
	public void validates_home_page_title()  {
		String homeTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homeTitle);
	}

	@Then("^Validate Logged in User$")
	public void validate_Logged_in_User(){
		testUtil = new TestUtil();
		testUtil.switchtoframe();
		Boolean bUserName = homepage.verifyCurrentUserName();
		Assert.assertTrue(bUserName);
		
		driver.quit();
	}
}
