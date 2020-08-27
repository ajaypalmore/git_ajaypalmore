package com.BlazeDemo.qa.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BlazeDemo.qa.base.TestBase;
import com.BlazeDemo.qa.pages.BlazeDemoIndex;
import com.BlazeDemo.qa.pages.BlazeDemo_Confirmation;
import com.BlazeDemo.qa.pages.BlazeDemo_Purchase;
import com.BlazeDemo.qa.pages.BlazeDemo_Reserve;
import com.BlazeDemo.qa.pages.GoogleAnalyticsSolutionPage;
import com.BlazeDemo.qa.util.TestUtil;

public class BlazeDemo extends TestBase {
	GoogleAnalyticsSolutionPage googleanalyticssolution;
	BlazeDemoIndex blazedemoindexpage;
	BlazeDemo_Reserve blazedemoreservepage;
	BlazeDemo_Purchase blazedemopurchasepage;
	BlazeDemo_Confirmation blazedemoconfirmationpage;
	TestUtil testUtil;
	
	public BlazeDemo() {
		super();
	}
	
	@BeforeMethod
	public void stepUp() {
		initizatalion();
		blazedemoindexpage = new BlazeDemoIndex();
		blazedemoreservepage =  new BlazeDemo_Reserve();
		blazedemopurchasepage = new BlazeDemo_Purchase();
		blazedemoconfirmationpage = new BlazeDemo_Confirmation();
		testUtil = new TestUtil();
	}

	
	@Test
	public void verifyBlazeDemo_FlightReservation() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String strConfirmationText = "Thank you for your purchase today!";
		
		blazedemoindexpage.dropdowndeparture.selectByVisibleText("Paris");
		
		blazedemoindexpage.dropdowndestination.selectByValue("Rome");
		
		blazedemoindexpage.btnFindFlights.click();
		
		wait.until(ExpectedConditions.visibilityOf(blazedemoreservepage.btnchoosethisflight)).isDisplayed();
		
		blazedemoreservepage.btnchoosethisflight.click();
		
		wait.until(ExpectedConditions.visibilityOf(blazedemopurchasepage.tbName)).isDisplayed();
		
		blazedemopurchasepage.tbName.sendKeys("Ajay More");
		
		blazedemopurchasepage.tbAddress.sendKeys("123 Road Ivy Estate" );
		
		blazedemopurchasepage.tbCity.sendKeys("Pune");
		
		blazedemopurchasepage.tbState.sendKeys("Maharastra");
		
		blazedemopurchasepage.tbZipCode.sendKeys("412207");
		
		blazedemopurchasepage.tbCreditCardNumber.sendKeys("4444333322221111");
		
		blazedemopurchasepage.tbMonth.sendKeys("12");
		
		blazedemopurchasepage.tbYear.sendKeys("2024");
		
		blazedemopurchasepage.tbnNmeonCard.sendKeys("Ajay More");
		
		blazedemopurchasepage.btnPurchaseFlight.click();
		
		wait.until(ExpectedConditions.visibilityOf(BlazeDemo_Confirmation.textThankYouForYourPurchaseToday)).isDisplayed();
		
		Assert.assertEquals(BlazeDemo_Confirmation.textThankYouForYourPurchaseToday.getText(), strConfirmationText, "Ticket Purchase done");
		

	}
	@Test
	public void verifyBlazeDemo_destinationOfTheWeek() throws InterruptedException
	{
		String strTitle = "BlazeDemo - vacation";
		
		blazedemoindexpage.linkdestinationoftheweek.click();
		
		Assert.assertEquals(driver.getTitle(), strTitle,"Vaction");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
