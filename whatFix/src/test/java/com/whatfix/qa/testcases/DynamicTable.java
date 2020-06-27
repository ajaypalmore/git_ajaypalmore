package com.whatfix.qa.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String Url = "https://www.freecrm.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS) ;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(Url);
		
		driver.findElement(By.name("username")).sendKeys("ajaypalmore");
		driver.findElement(By.name("password")).sendKeys("ajay1234");
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		WebDriverWait wait = new WebDriverWait(driver, 30);
			
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))));
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		List<WebElement> lstname = driver.findElements(By.xpath("//form[@id='vContactsForm']//table//tbody//tr"));
	
		System.out.println("List Size :::::>>>>>  "+lstname.size());
		for (int i = 4; i<lstname.size()-1;i++)
		{
			WebElement columnName = driver.findElement(By.xpath("//form[@id='vContactsForm']//table[@class='datacard']//tbody//tr["+i+"]//td[@class='datalistrow']//a"));
			System.out.println("Row Number ::::::>>>> "+i+" Name ::::>>>> "+columnName.getText());
		}
		
		//driver.quit();
	}

}
