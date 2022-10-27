package seleniumtest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
WebDriver driver = new ChromeDriver();
//driver.get("https://opensource-demo.orangehrmlive.com/");

//String winid = driver.getWindowHandle();
//System.out.println(winid);
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

//Set<String> winids = driver.getWindowHandles();

//Iterator<String> ids = winids.iterator();
//String pid = ids.next();

//List<String> winlist = new ArrayList(winids);
//String pwinlist = winlist.get(0);
//System.out.println(pwinlist);
//String cwinlist = winlist.get(1);
//System.out.println(cwinlist);

//driver.switchTo().window(pwinlist);
driver.get("https://www.amazon.com");
driver.manage().window().maximize();
List<WebElement> list1 = driver.findElements(By.tagName("A"));

for (int i=0;i<=list1.size();i++)
{
System.out.println(list1.get(i).getText());		
}
	}

}
