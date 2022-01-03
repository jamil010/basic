package javaBasics;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class takeScreenShot {
  public static WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		
	Browsers("edge");
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com");
	
   File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(screenshot, new File(".//screenshot/screen.png"));

		
	}
	public static void Browsers(String browsers) {
		if(browsers.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if(browsers.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver","C:\\Drivers\\microsoftEdge\\msedgedriver.exe");
		driver = new EdgeDriver();
	}else {
		System.out.println("Check the browser spellings");
	}
		
	}

}
