package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumdropdown {

	//private static final String  = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");

WebDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Dropdown.html");
WebElement dropdown1box = driver.findElement(By.id("dropdown1"));
Select select1 = new Select(dropdown1box);
select1.selectByIndex(1);
dropdown1box.sendKeys("Appium");

List<WebElement> listofoption =  select1.getOptions();
int size1 = listofoption.size();
System.out.println("the size is  "+size1);



	}

}
