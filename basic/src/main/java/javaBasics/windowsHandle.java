package javaBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandle {


	public static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("openwindow")).click();
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentwindow = it.next();
		
	    String childwindow = it.next();
	    driver.switchTo().window(childwindow);
	    driver.findElement(By.linkText("Register")).click();
	}

}
