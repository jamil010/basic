package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {
     static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement mousemove = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		Actions action = new Actions(driver);
		action.moveToElement(mousemove).build().perform();
		WebElement musiclibrary = driver.findElement(By.linkText("Music Library"));
		action.moveToElement(musiclibrary).click().build().perform();
		
		
		
		
	}

}
