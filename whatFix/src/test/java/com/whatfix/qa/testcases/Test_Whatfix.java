package com.whatfix.qa.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.whatfix.qa.util.TestUtil;

public class Test_Whatfix {
	
	public static void main(String[] agrs) throws AWTException
	{
		Robot robot = new Robot();
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LONG_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);

		driver.get("https://whatfix.com/community/");
		
		driver.findElement(By.xpath("//a[@id='wfx-dashboard-install-editor']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='WFMAKB WFMACB']")));
	
		driver.findElement(By.xpath("//a[@class='WFMAKB WFMACB']")).click();
		robot.setAutoDelay(5000);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='WFMAKB WFMAJS']")));
		driver.findElement(By.xpath("//a[@class='WFMAKB WFMAJS']")).click();
		
		driver.quit();
	}

}
