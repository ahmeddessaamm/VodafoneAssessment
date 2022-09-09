package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToBasketPage extends BasePage {
	
	public AddToBasketPage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}
	
@FindBy(id = "add-to-cart-button")	
WebElement addToCartButton ;

@FindBy(xpath = "//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")
WebElement confirmProductToBasket ;

public void addFirstProductToBasket () {
	addToCartButton.click();
	try {
		wait.until(ExpectedConditions.visibilityOf(this.confirmProductToBasket));
			if(confirmProductToBasket.isDisplayed());
			confirmProductToBasket.click();
	}
		catch (Exception e){
			e.getMessage();
		}
		
	
}

public void addSecondProductToBasket () {
	addToCartButton.click();
	try {
	wait.until(ExpectedConditions.visibilityOf(this.confirmProductToBasket));
		if(confirmProductToBasket.isDisplayed());
		confirmProductToBasket.click();
	}
	catch (Exception e){
		e.getMessage();
	}
}

}