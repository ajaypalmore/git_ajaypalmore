package com.qa.utils;

import com.qa.utils.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LONG_TIMEOUT = 50;
	public static long IMPLICT_WAIT = 30;
	
	public void switchtoframe()
	{
		driver.switchTo().frame("mainpanel");
	}
}
