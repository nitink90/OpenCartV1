package baseLibrary;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import propertyUtility.PropertyUtility;

public class BaseLibrary implements PropertyUtility{
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

}
