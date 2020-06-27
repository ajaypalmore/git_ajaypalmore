package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement labelContacts;
	
	@FindBy(id = "first_name")
	WebElement firstName;
	
	@FindBy(id = "surname")
	WebElement lastName;
	
	@FindBy(name = "client_lookup")
	WebElement companyName;
	
	@FindBy(xpath = "//input[@value='Save']")
	WebElement btnSave;
	
	public boolean verifyContactLabel()
	{
		return labelContacts.isDisplayed();
	}
	public void createNewContact(String title,String fName,String lName, String compName) 
	{
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		companyName.sendKeys(compName);
		btnSave.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
