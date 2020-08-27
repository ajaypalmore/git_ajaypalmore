package com.BlazeDemo.qa.util;

import org.openqa.selenium.By;

import com.BlazeDemo.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LONG_TIMEOUT = 50;
	public static long IMPLICT_WAIT = 30;

	public void switchtoframe()
	{
		
		
	}
	
	public void switchtodefault()
	{
		
		driver.switchTo().defaultContent();
	}
	
}
