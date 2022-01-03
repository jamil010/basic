package objectOrientProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signAmazon {
	
	public WebDriver driver = null;
	
	@FindBy(id ="nav-link-accountList") 
	WebElement AccSign ;
	@FindBy(linkText = "Account")
	WebElement Account;
	
	public signAmazon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver ,this);
		
	}
	public void sign() {
		Actions ac = new Actions(driver);
		ac.moveToElement(AccSign).build().perform();
		ac.moveToElement(Account).build().perform();
		ac.click().build().perform();;
		
	}
		
		
	
	

}
