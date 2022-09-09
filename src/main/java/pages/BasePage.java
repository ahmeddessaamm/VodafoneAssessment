package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	public Actions action;
	public WebDriverWait wait;
	
public BasePage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	 
} 
protected static void clickButton (WebElement button) {
	button.click();	
}
protected static void setTextInElementText (WebElement textElement , String value) {
	textElement.sendKeys(value);
	
}
public static void selectElement (WebElement selectedElement,String SelectbyVisibleText) {
	
Select selectedvalue = new Select(selectedElement);

selectedvalue.selectByVisibleText(SelectbyVisibleText);
	
}



}
