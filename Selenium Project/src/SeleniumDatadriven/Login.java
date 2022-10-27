package SeleniumDatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {
	
	/*String[][] data = {
		{"Admin","admin123"},
		{"Admin","admin1234"},
		{"Admin1","admin123"},
		{"Admin1","admin1234"}
	};*/
	
	String [][] data = null;
	
	//@DataProvider(name="LoginData")

	
/*	public String[][] dataprovider() throws BiffException, IOException
	{
	return data=dataproviderfromexcel();	
	}
	
	public String[][] dataproviderfromexcel() throws BiffException, IOException
	{
		FileInputStream excelfile = new FileInputStream("/Users/chitra/Desktop/Chitra-QA/datafiles/TestngDD.xlsx");
		Workbook wb = Workbook.getWorkbook(excelfile);
		Sheet sh = wb.getSheet(0);
		
		int rowcount = sh.getRows();
		int colcount = sh.getColumns();
		
		String testdata[][]=new String[rowcount-1][colcount];
		
		
		for (int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				testdata[i-1][j]=sh.getCell(j,i).getContents();
			}
			
		}
		
	return testdata;
	
	
	}
	
	*/
	
	@Test(dataProvider = "loginData",dataProviderClass = Datautils.class)
	
	

	
	public void logindatacheck(String data[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(data[0]);
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys(data[1]);
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		button.click();
		driver.quit();
		
	}
	
	/*
	public void logindatacheck(String uname,String Pass)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(uname);
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys(Pass);
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		button.click();
		driver.quit();
		
	}
*/
}
