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
@FindBy(xpath= "//input[contains(@name,'submit.save-for-later')]")
WebElement SaveForLaterButton;
@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div[3]/div/div[2]/div[1]/div/form/div[2]/div[3]/div/div[2]/span")
WebElement SaveforLaterMsg;
@FindBy (id="sc-saved-cart-list-caption-text")
WebElement SavedForLaterNumbers ;
	@FindBy(xpath= "//input[contains(@name,'submit.move-to-cart')]")
	WebElement MoveToBasketButton;


public void ValidateAddedItemsAreVisible() {


	Assert.assertEquals(TotalItems.getText(),"Subtotal (2 items):");

	}

	public void saveForLater () throws InterruptedException {
Thread.sleep(3000);
		SaveForLaterButton.click();
		wait.until(ExpectedConditions.visibilityOf(this.SaveforLaterMsg));
		Assert.assertTrue(SaveforLaterMsg.getText().contains("has been moved to Save For Later"));
		wait.until(ExpectedConditions.visibilityOf(this.SavedForLaterNumbers));
		Assert.assertEquals(SavedForLaterNumbers.getText(),"Saved for later (1 item)");
	}

	public void MoveToBasket () throws InterruptedException {
		Thread.sleep(3000);
		MoveToBasketButton.click();
		Assert.assertEquals(TotalItems.getText(),"Subtotal (2 items):");
		wait.until(ExpectedConditions.visibilityOf(this.SavedForLaterNumbers));
		Assert.assertEquals(SavedForLaterNumbers.getText(),"No items saved for later");
	}
}



