package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	public void doubleClick(WebElement ele);
	public void rightClick(WebElement ele);
	
	public void getWindowsHandle(int index);
	
	public void uploadFile(String file);
	
	public void selectByVisibleText(WebElement ele, String text);
	public void selectByIndex(WebElement ele, int index);
	public void selectByValue(WebElement ele, String value);

}
