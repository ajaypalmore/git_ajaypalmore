package com.whatfix.qa.util;

import org.openqa.selenium.By;

import com.whatfix.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LONG_TIMEOUT = 50;
	public static long IMPLICT_WAIT = 30;

	public void switchtoframe()
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@title,'Get Started with Whatfix')]")));
		//driver.switchTo().frame("Get Started with Whatfix");
	}
	
	public void switchtodefault()
	{
		
		driver.switchTo().defaultContent();
	}
	
}
