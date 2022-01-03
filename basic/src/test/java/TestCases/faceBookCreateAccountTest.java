package TestCases;

import org.testng.annotations.Test;

import Common.Utilities;
import objectOrientProgram.createAccount;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class faceBookCreateAccountTest extends Utilities{
  @Test
  public void createAc() throws InterruptedException {
	  
	 createAccount ac = new createAccount(driver);
	  ac.create();
	  ac.mobile();
	  ac.month();
	  ac.day();
	  ac.year();
	  Thread.sleep(3000);
	  ac.male();
	 
  }}
  /*
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  }

  @AfterMethod
  public void teardown() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }  

}*/
