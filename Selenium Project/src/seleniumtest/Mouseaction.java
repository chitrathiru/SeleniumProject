package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;


public class Mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	//	String text1 = driver.findElement(By.xpath("//a[normalize-space()='Sheela Foam']"/parent::a)).getText();

		
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement butele = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		act.contextClick(butele).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0]:", butele);

		//Robot rb = new Robot();
		
	}

}
