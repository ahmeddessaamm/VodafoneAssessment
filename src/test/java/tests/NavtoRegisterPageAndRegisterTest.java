package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegistrationPage;

public class NavtoRegisterPageAndRegisterTest extends TestBasis {
	HomePage homeObject ;
	UserRegistrationPage registerobject ;
	
	@Test(priority=0)
	public void userCanNavigatetoRegistrationPage() throws InterruptedException
	{
		
	homeObject = new HomePage(driver);
	homeObject.Hoover();
	homeObject.openRegisterPage();
	}
	@Test(priority=1)
	public void UserCanRegister()
	{
	registerobject = new UserRegistrationPage(driver);
	registerobject.userRegister("Ahmed Essam", "pppjouounk@emergentvillage.org", "Password@12");
	
}
}
