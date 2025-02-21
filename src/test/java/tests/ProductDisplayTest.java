package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ProductDisplayPage;

public class ProductDisplayTest extends BaseLibrary{
	ProductDisplayPage ob;
	
	@BeforeTest
	public void launchurl()
	{
		launchUrl("stagingUrl");
		ob = new ProductDisplayPage();
	}
	
	@Test(priority=1)
	public void searchProduct()
	{
		ob.searchProduct();
	}
	@Test(priority=2)
	public void clickOnProductImage()
	{
		ob.clickOnProductImage();
	}
	@Test(priority=3)
	public void clickOnLeftRightArrow()
	{
		ob.clickOnLeftRightArrow();
	}
	@Test(priority=4)
	public void clickOnNormalImg() throws InterruptedException
	{
		ob.clickOnNormalImg();
	}

}
