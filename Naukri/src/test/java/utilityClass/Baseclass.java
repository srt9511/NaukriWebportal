package utilityClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver ;
	@BeforeSuite
	public void initializations () {
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


}
