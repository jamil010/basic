package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectOrientProgram.signAmazon;

public class AmazonAccountsignin {
	
	WebDriver driver;
	@Test
	public void pub() {
	signAmazon j = new signAmazon(driver);

	j.sign();
	

		
	}
	@BeforeMethod
	public void Browsers( ) {
		
			  
			  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.amazon.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

}
		@AfterMethod
		public void teardown() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
	
		
	}}
