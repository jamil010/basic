package Demo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common.Utilities;

class demo1 extends Utilities{


	@Test
	public void pub() throws IOException {

	List<WebElement> links =	driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	List<WebElement> img =     driver.findElements(By.tagName("img"));
	System.out.println(img.size());
		
	for (int i = 0; i < links.size(); i++) {
		
		WebElement element =   links.get(i);
		String url =   element.getAttribute("href");
		
		URL link = new URL(url);
		
		HttpsURLConnection httpconn = (HttpsURLConnection)link.openConnection();
		httpconn.setConnectTimeout(3000);
		httpconn.connect();
		int response = httpconn.getResponseCode();
		if(response >= 400) {
			System.out.println(url +" - "+ "broken link");
		}
	}
		
	}
	}

  	

	  
	
		


	
	
	


