package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void stepUp() {
		initizatalion();
		
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void LoginPageTitle() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM in the cloud software boosts sales");
		
		
	}

	@Test(priority = 2)
	public void crmLogoImageTest() {
		Boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void MyLoginTest() {
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
