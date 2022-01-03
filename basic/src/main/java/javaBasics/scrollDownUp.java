package javaBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scrollDownUp {
    public static WebDriver driver= null;
	public static void main(String[] args) throws InterruptedException {
		
	Browsers("chrome");
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,900)");
	Thread.sleep(3000);
	

	}
	public static void Browsers(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if(browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\ChromeDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
	}else {
		System.out.println("Checck the spellings");
		
	}

}}
