package Testngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;
	//Aim to open chrome -->1)google.co.in 2)bing.com 3) yahoo.com and 4) close the browser

	@BeforeSuite
	public void openBrowser()
	{
		 starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
		driver = new ChromeDriver();
		
	}
@Test
	public void openGoogle()
	{
		driver.get("http://www.google.com");
		System.out.println("google");
	}
	
@Test
public void openYahoo()
	{
		driver.get("http://www.yahoo.com");
		System.out.println("yahoo");
	}
	
@Test
	public void openBing()
	{
		driver.get("http://www.bing.com");
		System.out.println("bing");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		 endtime = System.currentTimeMillis();
		 totaltime = endtime-starttime;
		 System.out.println("total time  "+totaltime);
	}
}
