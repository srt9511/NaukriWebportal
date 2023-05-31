package profileUpdate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	
	@FindBy (xpath="//a[@id='login_Layer']")
	WebElement LoginButton;
	
	@FindBy (xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	WebElement EmailIdEnter;
	
	@FindBy (xpath = "//input[@type='password']")
	WebElement PassWEnter ;
	
	@FindBy (xpath ="//button[@type='submit']")
	WebElement SubmitButton ;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	public void Login2Page () {
		
		LoginButton.click();
		EmailIdEnter.sendKeys("suraj.thete89@gmail.com");
		PassWEnter.sendKeys("PariT@892022");
		SubmitButton.click();
		
	}

}
