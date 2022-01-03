package objectOrientProgram;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public class createAccount {
	public WebDriver driver = null;
	
	@FindBy (linkText="Create new account")
	WebElement create;
    @FindBy (name ="firstname")
    WebElement firstName;
	@FindBy (name="lastname")
	WebElement lastName;	
	@FindBy (name ="reg_email__")
	WebElement mobilNo ;	
	@FindBy (id ="password_step_input")
	WebElement password;
	@FindBy (name ="birthday_month")
	WebElement month;
	@FindBy (id="day")
	WebElement day;
	@FindBy (id="year")
	WebElement year;
	@FindBy(xpath =  "(//*[@class='_58mt'])[2]")
	WebElement male;
//	@FindBy(id = "u_3_s_7h")
	//WebElement signup;
	

	
	public createAccount(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public void create() throws InterruptedException {
		create.click();
		firstName.click();
		firstName.sendKeys("imran");
		lastName.click();
		lastName.sendKeys("jamil");
	}
	public void mobile() {
			
		mobilNo.click();
		mobilNo.sendKeys("87669990");
		password.click();
		password.sendKeys("jhgbkhhjlh");
	}
	public void month() throws InterruptedException {
		//month.click();
		Select select = new Select(month);
		select.selectByVisibleText("Dec");
	}
	public void day() {
		Select select1 = new Select(day);
		select1.selectByVisibleText("15");
	}
	public void year() {
		Select select2 = new Select(year);
		select2.selectByVisibleText("1990");
	}
	public void male() throws InterruptedException {
		Thread.sleep(2000);
		male.click();
		
	}
		
	}	
	
		
	
	
	
	
	
	
	
	


