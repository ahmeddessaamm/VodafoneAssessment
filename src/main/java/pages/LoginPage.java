package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (id = "ap_email")
	WebElement emailTextbox ;
	@FindBy (id= "ap_password")
	WebElement passwordTextbox;
	@FindBy (id = "continue")
	WebElement loginButton ;
	
	@FindBy (id="signInSubmit")
	WebElement SignInSumbit;
	
	

public void insertMail (String emailTextbox ) {
	wait.until(ExpectedConditions.elementToBeClickable(this.emailTextbox));
	setTextInElementText(this.emailTextbox, emailTextbox);
	clickButton(loginButton);
	

}
public void insertPassword (String passwordTextbox ) {
	wait.until(ExpectedConditions.elementToBeClickable(this.passwordTextbox));
	setTextInElementText(this.passwordTextbox, passwordTextbox);
	clickButton(SignInSumbit);
}
}

