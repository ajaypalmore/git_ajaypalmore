package com.BlazeDemo.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.BlazeDemo.qa.base.TestBase;
public class BlazeDemo_Purchase extends TestBase {

	
	@FindBy(xpath = "//h2[@text='Your flight from TLV to SFO has been reserved.']")
	public WebElement textYourFlightFrom;
	
	@FindBy(xpath = "//input[@id='inputName']")
	public WebElement tbName;
	
	@FindBy(xpath = "//input[@id='address']")
	public WebElement tbAddress;
	
	@FindBy(xpath = "//input[@id='city']")
	public WebElement tbCity;
	
	@FindBy(xpath = "//input[@id='state']")
	public WebElement tbState;
	
	@FindBy(xpath = "//input[@id='zipCode']")
	public WebElement tbZipCode;
	
	@FindBy (xpath = "//Select[@id ='cardType']")
	public WebElement dropCardType;
	public Select dropdownCardType;
	
	@FindBy(xpath = "//input[@id='creditCardNumber']")
	public WebElement tbCreditCardNumber;
	
	@FindBy(xpath = "//input[@id='creditCardMonth']")
	public WebElement tbMonth;
	
	@FindBy(xpath = "//input[@id='creditCardYear']")
	public WebElement tbYear;
	
	@FindBy(xpath = "//input[@id='nameOnCard']")
	public WebElement tbnNmeonCard;
	
	@FindBy(xpath = "//input[@value='Purchase Flight']")
	public WebElement btnPurchaseFlight;
	
	public BlazeDemo_Purchase()
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
}
