package com.whatfix.qa.testcases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS) ;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.rediff.com");
		
		List<WebElement> brokenlink = driver.findElements(By.tagName("a"));
		System.out.println("Total Link on the Page::::"+brokenlink.size());
		
		for (int i = 0; i<brokenlink.size();i++)
		{
			String url = brokenlink.get(i).getAttribute("href");
			
			verifyLinks(url);
		}
		
		
	}

	private static void verifyLinks(String linkurl) {
		try{
			 URL url = new URL(linkurl);
			HttpURLConnection connect = (HttpURLConnection)url.openConnection();
			connect.setConnectTimeout(3000);
			connect.connect();
			if (connect.getResponseCode()==200)
			{
				System.out.println(linkurl+" --------------- "+connect.getResponseMessage());
				
			}else if (connect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{
				System.out.println(linkurl+" --------------- "+connect.getResponseMessage());
			}
		}
		catch (Exception ex)
		{
			
		}


		
	}

}
