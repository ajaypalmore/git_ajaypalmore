package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtl;
	ContactsPage contactsPage;

	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void stepUp() {
		initizatalion();
		testUtl = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	@Test(priority = 1)
	public void verifyHomePageTitle() {
		String HomePagetitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(HomePagetitle, "CRMPRO");
	}

	
	@Test(priority = 2)
	public void VerifyUserNameTest() {
		testUtl.switchtoframe();
		Boolean flag = homePage.verifyCurrentUserName();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void VerifyContactsLinkTest() {
		testUtl.switchtoframe();
		contactsPage = homePage.clickOnContactLink();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
