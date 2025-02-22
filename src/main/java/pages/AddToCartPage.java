package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class AddToCartPage extends BaseLibrary{
	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchBox;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//img[@title='iMac']")
	private WebElement imac;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//a[text()='shopping cart']")
	private WebElement shoppingCart;
	
	public void searchProduct()
	{
		searchBox.sendKeys("iMac");
		searchBtn.click();
	}
	public void clickProductDisplayed()
	{
		imac.click();
	}
	public void clickOnAddToCart()
	{
		addToCartBtn.click();
	}
	public void clickOnShoppingCart()
	{
		waitForClick(shoppingCart);
		shoppingCart.click();
	}

}
