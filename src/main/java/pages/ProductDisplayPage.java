package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class ProductDisplayPage extends BaseLibrary {
	public ProductDisplayPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchBox;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//img[@title='iMac']")
	private WebElement imac;
	@FindBy(xpath="//a[@href='https://naveenautomationlabs.com/opencart/image/cache/catalog/demo/imac_1-500x500.jpg']")
    private WebElement imacImage;
	
	@FindBy(xpath="//button[@title='Previous (Left arrow key)']")
	private WebElement leftArrow;
	@FindBy(xpath="//button[@title='Next (Right arrow key)']")
	private WebElement rightArrow;
	@FindBy(xpath="//button[@title='Close (Esc)']")
	private WebElement close;
	
	@FindBy(xpath="//img[@src='https://naveenautomationlabs.com/opencart/image/cache/catalog/demo/imac_3-74x74.jpg']")
	private WebElement normalImg1;
	@FindBy(xpath="//img[@src='https://naveenautomationlabs.com/opencart/image/cache/catalog/demo/imac_2-74x74.jpg']")
	private WebElement normalImg2;
	
	public void searchProduct()
	{
		searchBox.sendKeys("iMac");
		searchBtn.click();
	}
	
	public void clickOnProductImage()
	{
		imac.click();
		imacImage.click();
	}
	public void clickOnLeftRightArrow()
	{
		leftArrow.click();
		rightArrow.click();
		close.click();
	}
	public void clickOnNormalImg() throws InterruptedException
	{
		Thread.sleep(2000);
		normalImg1.click();
		leftArrow.click();
		rightArrow.click();
		close.click();
		
		Thread.sleep(2000);
		normalImg2.click();
		leftArrow.click();
		rightArrow.click();
		close.click();
	}

}
