package testClass_Profile_Update;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import profileUpdate.LoginPage;
import utilityClass.Baseclass;

public class LoginTest extends Baseclass {
	
public static LoginPage LP ;

@BeforeClass
public void initialization() {
	
	LP = new LoginPage (driver) ;
}

@Test
public void Login () {
	LP.Login2Page();
	
}
	
	
}
