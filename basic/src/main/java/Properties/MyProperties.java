package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.Utilities;

public class MyProperties extends Utilities {


		@Test
		public void property() throws IOException {
			Properties pr = new Properties();
			FileInputStream fs = new FileInputStream("C:\\Users\\jamil\\OneDrive\\Desktop\\eclipse work-space\\basic\\my.properties");
			pr.load(fs);
			
		}
	}
	


	

