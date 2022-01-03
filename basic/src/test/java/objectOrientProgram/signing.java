package objectOrientProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signing {
    public WebDriver driver= null;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "pass")
	WebElement password;
	@FindBy(xpath = "//*[@name='login']")
	WebElement log;
	
	public signing(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void signin() {
		email.sendKeys("imran");
		password.click();
		password.sendKeys("jamil");
		log.click();
		
	}
	
	
	}


