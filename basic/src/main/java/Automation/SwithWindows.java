package Automation;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class SwithWindows {
   static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement newtab =driver.findElement(By.id("openwindow"));
		newtab.click();
		Set<String> handles =  driver.getWindowHandles();
         Iterator<String> it  =    handles.iterator();	
        String parentwindow = it.next();
        String childwindow  =  it.next();
        driver.switchTo().window(childwindow);
       WebElement register = driver.findElement(By.linkText("Register"));
       register.click();
       driver.switchTo().window(parentwindow);

}}
