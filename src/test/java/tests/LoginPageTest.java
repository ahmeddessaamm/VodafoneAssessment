package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBasis {

	HomePage homeObject ;
	LoginPage loginobject ;
	
	@Test(priority = 0)
	public void UserCanLogin()
	{

		homeObject = new HomePage(driver);
		loginobject = new LoginPage(driver);
		
	}
	@Test (priority=1)
	public void openUserLoginPage () {
		homeObject.Hoover();
		homeObject.openSignInPage();
	}
	
	@Test (priority=2)
	public void InsertEmail () {
		
		
		loginobject.insertMail("madaessam@gmail.com");
		
	}
	@Test (priority=3)
	public void insertPassword ( ) {
		
		loginobject.insertPassword("asdf1234");
	}

}
