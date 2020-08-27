package com.BlazeDemo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.BlazeDemo.qa.base.TestBase;

public class BlazeDemoIndex extends TestBase {
	
	@FindBy(xpath = "//a[contains(text(),'destination of the week! The Beach!')]")
	public WebElement linkdestinationoftheweek;
	
	@FindBy(xpath = "//input[@value='Find Flights']")
	public WebElement btnFindFlights;
	
	@FindBy (xpath = "//Select[@name ='fromPort']")
	public WebElement dropdownfromport;
	public Select dropdowndeparture;
	
	@FindBy (xpath = "//Select[@name ='toPort']")
	public WebElement dropdowntoPort;
	public Select dropdowndestination;
	
	public BlazeDemoIndex()
	{
		PageFactory.initElements(driver, this);
		dropdowndeparture = new Select(dropdownfromport);
		dropdowndestination = new Select(dropdowntoPort);
	}
	
	

}
