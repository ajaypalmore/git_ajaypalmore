package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsTest extends TestBase  {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtl;
	ContactsPage contactsPage;
	String sheetName = "contacts";
	
	public ContactsTest() {
		super();
	}
	
	@BeforeMethod
	public void stepUp() {
		initizatalion();
		testUtl = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		testUtl.switchtoframe();
		//contactsPage = homePage.clickOnContactLink();
	}
	

	@Test(priority = 1)
	public void VerifyContactsLinkTest() {		
		Assert.assertTrue(contactsPage.verifyContactLabel());
	}
	@DataProvider
	public Object[][] getCRMTestData() throws Exception, Exception
	{
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
		
	}
	@Test(priority = 2,dataProvider = "getCRMTestData")
	public void ValidNewContactsTest(String title,String fName,String lName, String compName) throws InterruptedException {		
		
		homePage.clickonNewContactLink();
		Thread.sleep(4000);
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "TestCompany");
		contactsPage.createNewContact(title, fName, lName, compName);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
