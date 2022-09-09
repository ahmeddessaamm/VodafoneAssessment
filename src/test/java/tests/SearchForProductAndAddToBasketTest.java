package tests;

import org.testng.annotations.Test;

import pages.AddToBasketPage;
import pages.BasketPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchForProductPage;

public class SearchForProductAndAddToBasketTest extends TestBasis {

	HomePage homeObject ;
	LoginPage loginobject ;
	SearchForProductPage searchobject ;
	AddToBasketPage addtobasketobject;
	BasketPage basektpageobject;
	
	@Test (priority=1)
	public void openUserLoginPage () {
		homeObject = new HomePage(driver);
		homeObject.Hoover();
		homeObject.openSignInPage();
	}
	
	@Test (priority=2)
	public void InsertEmail () {
		loginobject = new LoginPage(driver);
		
		loginobject.insertMail("madaessam@gmail.com");
		
	}
	@Test (priority=3)
	public void insertPassword ( ) {
		
		loginobject.insertPassword("asdf1234");
	}

	@Test(priority=4)
	public void Search () {
		
		searchobject = new SearchForProductPage(driver);
		
		searchobject.searchforProduct("Drucker");
		
	}
	@Test(priority=5)
	public void selectFirstProduct () {
		
		searchobject.selectFirstProd();
		
	}
	@Test(priority=6)
	public void addFirstProductToBasket() {
		
		addtobasketobject = new AddToBasketPage(driver);
		addtobasketobject.addFirstProductToBasket();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=7)
public void selectSecondProduct () {
		
		searchobject.selectSecondProd();
		
	}
	@Test(priority=8)
	public void addSecondProductToBasket () {
		
		addtobasketobject.addSecondProductToBasket();
		
	}
	
	@Test(priority=9)
	public void ValidateThatItemsVisible () {
		
		basektpageobject = new BasketPage(driver);
		basektpageobject.ValidateAddedItemsAreVisible();
		
		
	}
	@Test(priority=10)
	public void Save4later() {
		
		basektpageobject.SaveForLater();
	}
}
