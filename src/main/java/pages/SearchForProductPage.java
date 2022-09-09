package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchForProductPage extends BasePage {
	
	public SearchForProductPage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}
	
@FindBy(id = "twotabsearchtextbox")	
WebElement searchBar ;

@FindBy(id = "nav-search-submit-button")
WebElement searchbutton ;

@FindBy(xpath ="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")
WebElement selectFirstProduct;
@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
WebElement selectSecondProduct;

public void searchforProduct (String searchBar){
	
	setTextInElementText(this.searchBar, searchBar);
	searchbutton.submit();
	
}
public void selectFirstProd (){
	
	
	selectFirstProduct.click();
}

public void selectSecondProd (){
	
	
	selectSecondProduct.click();
}
}