package com.BlazeDemo.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.BlazeDemo.qa.base.TestBase;

public class BlazeDemo_Confirmation extends TestBase {
	
	@FindBy(xpath = "//div/div/h1")
	public static WebElement textThankYouForYourPurchaseToday;
	
	public BlazeDemo_Confirmation()
	{
		PageFactory.initElements(driver, this);
	}

}
