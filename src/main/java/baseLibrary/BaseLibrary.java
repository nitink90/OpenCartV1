package baseLibrary;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import propertyUtility.PropertyUtility;
import waitUtility.WaitUtility;

public class BaseLibrary implements PropertyUtility, WaitUtility{
	public static WebDriver driver = null;
	
	public void launchUrl(String key)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(getReadData(key));
		driver.manage().window().maximize();
	}

	@Override
	public String getReadData(String key) {
		String val="";
		String configpath="D:\\Testing Baba Automation Full Course\\Git Project\\OpenCartV1_Repo\\OpenCartV1\\TestData\\config.properties";
		try {
			FileInputStream fis = new FileInputStream(configpath);
			Properties prop = new Properties();
			prop.load(fis);
			val=prop.getProperty(key);
		} catch (Exception e) {
			System.out.println("Issue in get read data : " + e);
		}
		return val;
	}

	@Override
	public void waitForClick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

}
