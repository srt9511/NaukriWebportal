package profileUpdate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	
	@FindBy (xpath="//div[@class='nI-gNb-drawer__icon']")
	WebElement MenuButton;
	
	@FindBy (partialLinkText="View & Update Profile")
	WebElement VandUProfile;

}
