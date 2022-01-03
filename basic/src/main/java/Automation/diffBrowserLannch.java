package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class diffBrowserLannch  {
	public WebDriver driver= null;

		@Test
		public void test() {
			
	
	}
		@BeforeMethod
		public void lanchbrowser() {
			Browsers("chrome", "http://www.facebook.com");
			
		}
		public void Browsers(String browsers ,String website) {
			
			if(browsers.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Drivers\\ChromeDriver\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.get(website);
				driver.manage().window().maximize();
			}else if(browsers.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver","C:\\Drivers\\microsoftEdge\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(website);
			}else {
				System.out.println("Check the spellings");	
			}}
			@AfterMethod
			public void teardown() {
				driver.close();
				
   }}

			
		
	

		
		
		  
		
		
		
		
	
	
    
		




	 




	
	
		 
		 
		 
	 	 
  
	


