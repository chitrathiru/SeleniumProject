package ExtentReports;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GenerateExtentReports {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter HtmlReport;
	ExtentTest testcase;
	
	//final File conf = new File("extent-config.xml");
	
	
	@Test
	public void openGoogle() throws IOException
	{
		testcase=extent.createTest("Verify google test");
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		testcase.log(Status.INFO, title);
		if (title.equals("Google"))
		{
		
			testcase.log(Status.PASS,"Google pass");
		}else
		{
			testcase.log(Status.FAIL,"Google failed");
			TakesScreenshot ss = (TakesScreenshot) driver;
			File sfile = ss.getScreenshotAs(OutputType.FILE);
			File tfile = new File("extentfailgoogle.png");
			FileHandler.copy(sfile, tfile);
			testcase.addScreenCaptureFromPath("extentfailgoogle.png");
		}
	}
	///Users/chitra/eclipse-workspace/Selenium Project/test-output
	
	@Test
	public void openYahoo() throws IOException
	{
		testcase = extent.createTest("Verify Yahoo test");
		
		driver.get("http://www.yahoo.com");
		String title = driver.getTitle();
		testcase.log(Status.INFO, title);
		if (title.equals("Yahoo"))
		{
			testcase.log(Status.PASS, "Yahoo passes");
		}else
		{
			testcase.log(Status.FAIL,"Yahoo failed");
			TakesScreenshot ss = (TakesScreenshot) driver;
			File Sfile = ss.getScreenshotAs(OutputType.FILE);
			File tfile = new File("extentfailyahoo.png");
			FileHandler.copy(Sfile, tfile);
			testcase.addScreenCaptureFromPath("extentfailyahoo.png");
		}
			
	}
	
	@BeforeSuite
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
		extent = new ExtentReports();
		HtmlReport = new ExtentSparkReporter("extentreport.html");
		driver = new ChromeDriver();
		extent.attachReporter(HtmlReport);
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		extent.flush();
	}

}
