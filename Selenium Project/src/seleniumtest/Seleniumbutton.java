package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/chitra/Desktop/Chitra-QA/chromedriver");
WebDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Button.html");

//get xy position
WebElement getxypositionbutton = driver.findElement(By.id("position"));

Point pointxy = getxypositionbutton.getLocation();
int xvalue = pointxy.getX();
int yvalue = pointxy.getY();

System.out.println("x value : "+xvalue + "  y value : "+ yvalue);

//get bg color

WebElement getcolorbutton = driver.findElement(By.id("color"));
String colorbutton = getcolorbutton.getCssValue("background-color");
System.out.println("the color is  : "+colorbutton);

//find the size

WebElement findsize = driver.findElement(By.id("size"));
int heightof = findsize.getSize().getHeight();
int widthof = findsize.getSize().getWidth();

System.out.println("height is : "+heightof+" width is : "+widthof);

//go to hoem button

driver.findElement(By.id("home")).click();





	}

}
