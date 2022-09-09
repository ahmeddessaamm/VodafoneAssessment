package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {
	

	public HomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
		
	}
	
@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")	
WebElement hooverSelect ;

@FindBy(xpath = "//*[@id=\"nav-flyout-ya-newCust\"]/a")
WebElement signUP ;

@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a")
WebElement SignIn;


	
public void Hoover() {
	wait.until(ExpectedConditions.visibilityOf(this.hooverSelect));
	action.moveToElement(hooverSelect).build().perform();
	
}
public void openRegisterPage () {
	
	
	signUP.click();
}
public void openSignInPage () {
	
	wait.until(ExpectedConditions.elementToBeClickable(this.SignIn));
	SignIn.click();
}
}