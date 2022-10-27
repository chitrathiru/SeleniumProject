package Testngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallelex {
	@Test
	public void openGoogle()
	{
		 //starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
	@Test
	public void openYahoo()
	{
		 //starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
		
	}

}
