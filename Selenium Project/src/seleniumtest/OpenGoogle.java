package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogle {

	public static void main(String[] args) {
		System.out.println("hello");
		// TODO Auto-generated method stub
//chrome browser open
		System.setProperty("webdriver.chrome.driver","/Users/chitra/Desktop/Chitra-QA/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("chitra"+Keys.ENTER);
		
		//driver.get("http://leafground.com/pages/Link.html");
		//driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		//driver.findElement(By.id("email")).sendKeys("testing@gmail.com");	
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("testing@gmail.com");
		
		
		
		
		//driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("testing");
		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys("testing");
		
		WebElement getBox = driver.findElement(By.name("username"));
		String value1 = getBox.getAttribute("value");
		//String value1 = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(value1);
		
		//driver.findElement(By.name("username")).clear();
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disableBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = disableBox.isEnabled();
		System.out.println(enabled);
		//driver.quit();
		
	}

}
