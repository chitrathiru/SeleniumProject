package seleniumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlert {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		
		//driver.get("http://leafground.com/pages/Alert.html");
		
		/* driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert with ok button
		
		 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();//close alert using cancel button
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alertwind = driver.switchTo().alert();
		System.out.println("the text is   "+alertwind.getText());
		alertwind.sendKeys("welcome");
		alertwind.accept(); */
		
	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth")	;
		
		//WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		
		//alertbox.click();
		//Alert alertct = driver.switchTo().alert();
		//Thread.sleep(3000);
		//alertct.accept();
		
		//WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		//confirmbox.click();
		//Alert confirmct = driver.switchTo().alert();
		//Thread.sleep(3000);
		//confirmct.dismiss();
		
		//WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		//promptbox.click();
		
		//Alert promptct = driver.switchTo().alert();
		//promptct.sendKeys("duckling");
		//Thread.sleep(3000);
		//promptct.accept();
		
		
	}

}
