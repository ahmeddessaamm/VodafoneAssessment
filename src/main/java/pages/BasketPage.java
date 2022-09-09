package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class BasketPage extends BasePage {
	
	public BasketPage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}
	
@FindBy(partialLinkText  = "Canon PIXMA TR4650 Colour")	
WebElement FirstProductInBasketPage ;

@FindBy(partialLinkText  = "Bundle Canon PIXMA TS5150 Multifunctional")
WebElement SecondProductInBasketPage ;

@FindBy(name  = "submit.save-for-later.C0a6b4dc9-fa4e-4ec5-a509-1e5d52339663")
WebElement SaveForLaterButton;

public void ValidateAddedItemsAreVisible() {
	
	Assert.assertTrue(FirstProductInBasketPage.isDisplayed());
	Assert.assertTrue(FirstProductInBasketPage.getText().contains("Canon PIXMA TR4650 Colour"));
	if(FirstProductInBasketPage.isDisplayed()) {
		System.out.println("First Product Is Visible");
	}
	Assert.assertTrue(SecondProductInBasketPage.isDisplayed());
	Assert.assertTrue(SecondProductInBasketPage.getText().contains("Bundle Canon PIXMA TS5150 Multifunctional"));
	if(SecondProductInBasketPage.isDisplayed()) {
		System.out.println("Second Product Is Visible");
	}
}
public void SaveForLater () {
	
	wait.until(ExpectedConditions.elementToBeClickable(this.SaveForLaterButton));
	Assert.assertTrue(SaveForLaterButton.isDisplayed());
	SaveForLaterButton.submit();
	
	
}



}