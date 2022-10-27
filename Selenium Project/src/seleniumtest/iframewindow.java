package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		// 1st frame
		/* driver.switchTo().frame("packageListFrame");//name of the frame
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
	
		//2nd frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
		
		//3rd frame
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']']")).click(); */
		
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//WebDriverWait ws = new WebdriverWait(driver);
	//ws.until(null)
	 //.polling
	 //.ignore
		
	}

}
