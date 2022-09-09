package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserRegistrationPage extends BasePage {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);	
	}
@FindBy (id = "ap_customer_name")
WebElement userName ;

@FindBy (id = "ap_email")
WebElement email ;

@FindBy (id = "ap_password")
WebElement password ;
	
@FindBy (id = "ap_password_check")
WebElement renterPassword ;
@FindBy (id="continue")
WebElement continueBtn;


public void userRegister(String userName,  String email ,String password) {
	

	setTextInElementText(this.userName, userName);
	setTextInElementText(this.email, email);
	setTextInElementText(this.password, password);
	setTextInElementText(this.renterPassword, password);
	continueBtn.submit();
	
	
}


}
