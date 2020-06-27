package com.whatfix.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.whatfix.qa.base.TestBase;
import com.whatfix.qa.pages.GoogleAnalyticsSolutionPage;
import com.whatfix.qa.util.TestUtil;

public class WhatFix_Test extends TestBase {
	GoogleAnalyticsSolutionPage googleanalyticssolution;
	TestUtil testUtil;
	
	public WhatFix_Test() {
		super();
	}
	
	@BeforeMethod
	public void stepUp() {
		initizatalion();
		googleanalyticssolution = new GoogleAnalyticsSolutionPage();
		testUtil = new TestUtil();
	}

	
	@Test
	public void verifyWhatFix() throws InterruptedException
	{
		Assert.assertTrue(googleanalyticssolution.verifySelfHelplink());
		googleanalyticssolution.clickSelfHelplink();
		
		testUtil.switchtoframe();
		Assert.assertTrue(googleanalyticssolution.verifyHowToEmbedFlows());
		googleanalyticssolution.clickHowToEmbedFlows();
		testUtil.switchtodefault();
		
		Assert.assertTrue(googleanalyticssolution.verifylinkEmbed());
		googleanalyticssolution.clickEmbed();
		
		Assert.assertTrue(googleanalyticssolution.verifytoolTipslideshow());
		googleanalyticssolution.clicktoolTipslideshow();
		
		Assert.assertTrue(googleanalyticssolution.verifylinkRightArrow());
		googleanalyticssolution.clicklinkRightArrow();
		
		Assert.assertTrue(googleanalyticssolution.verifylinkClose());
		googleanalyticssolution.clicklinkClose();
		
		Assert.assertTrue(googleanalyticssolution.verifylinkInstallEdtior());

	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
