package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.AddToCartPage;

public class AddToCartTest extends BaseLibrary{
	AddToCartPage ob;
	
	@BeforeTest
	public void launchurl()
	{
		launchUrl("stagingUrl");
		ob = new AddToCartPage();
	}
	
	@Test(priority=1)
	public void searchProduct()
	{
		ob.searchProduct();
	}
	@Test(priority=2)
	public void clickProductDisplayed()
	{
		ob.clickProductDisplayed();
	}
	@Test(priority=3)
	public void clickOnAddToCart()
	{
		ob.clickOnAddToCart();
	}
	@Test(priority=4)
	public void clickOnShoppingCart()
	{
		ob.clickOnShoppingCart();
	}

}
