package javaBasics;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Common.Utilities;

public class BrokinLinks extends Utilities {
	
	//public WebDriver driver = null;
	
	@Test
	public void test() throws IOException {
		
	List<WebElement> links =driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
  for (int i = 0; i < links.size(); i++) {
    
	     WebElement element =    links.get(i);
	     String url =  element.getAttribute("href");
	     
	     URL link = new URL (url);
	     
	     HttpsURLConnection httpconn = (HttpsURLConnection)link.openConnection();
	     
	     httpconn.setConnectTimeout(3000);
	     httpconn.connect();
	     int response =httpconn.getResponseCode();
	     
	     if(response>=400) {
	    	 System.out.println(url + " - " +" Broken link");
	     
	}else {
		System.out.println(url +" - "+"valid link");
	
	}}}}
  	

	  
	
		


	
	
	



