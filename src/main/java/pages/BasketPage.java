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
	


@FindBy(id="sc-subtotal-label-activecart")
WebElement TotalItems ;


public void ValidateAddedItemsAreVisible() {


	Assert.assertEquals(TotalItems.getText(),"Subtotal (2 items):");
	}
}



