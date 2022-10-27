package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckbox {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","/Users/chitra/Desktop/Chitra-QA/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().window().maximize();
	
	List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));
	System.out.println("total "+ chkbox.size());
	
	for (int i=0;i<chkbox.size();i++)
	{
	chkbox.get(i).click();
	}
	}
	
}
