package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory -- OR

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;

	@FindBy(xpath = "//button[contains(text(),'Sign Up']")
	WebElement SignUpBtn;

	@FindBy(xpath = "//img[@alt='free crm logo']")
	WebElement crmLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
	
		return driver.getTitle();
	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}

	public HomePage Login(String user, String pwd) {
		username.sendKeys(user);
		password.sendKeys(pwd);
		LoginBtn.click();

		return new HomePage();
	}

}
