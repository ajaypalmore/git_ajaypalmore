package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//td[@class='headertext'][1]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement linkContact;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement linkDeals;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement linkTasks;
	
	@FindBy(xpath = "//a[contains(text(),'Call')]")
	WebElement linkCall;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement linkNewContacts;
	
	public Boolean verifyCurrentUserName()
	{
		return userNameLabel.isDisplayed();
	}
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactLink()
	{
		linkContact.click();
		return new ContactsPage();
	}
	

	public DealsPage clickOnDealsLink()
	{
		linkDeals.click();
		return new DealsPage();
	}

	public void clickonNewContactLink()
	{
		Actions action = new Actions(driver);
		
		action.moveToElement(linkContact).build().perform();
		linkNewContacts.click();
		
		
	}
}
