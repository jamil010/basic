package TestCases;

import org.testng.annotations.Test;

import Common.Utilities;
import objectOrientProgram.signing;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class facebookloginTest extends Utilities {
		

  @Test
  public void test() {
	  signing sign = new signing(driver);
	  sign.signin();

  }}
  
  /*
  
  public void f() {
  }
  @BeforeMethod
  public void faceBookSigningFunction() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  }

  @AfterMethod
  public void teardown() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

}*/
