package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Utilities {
	public WebDriver driver = null;
	

	@Parameters({"browser","website"})
	@BeforeMethod
	public void Browsers(String browsers,String website ) {
		
		if(browsers.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(website);
			driver.manage().window().maximize();
		}else if(browsers.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Drivers\\microsoftEdge\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(website);
		}else {
			System.out.println("Check the spellings");	
		
		}}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();


}}
