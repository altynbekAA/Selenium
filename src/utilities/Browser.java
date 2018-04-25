package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilities.Config;

public class Browser {

	private static WebDriver driver = null;

	/**
	 * Sets up the driver 
	 * 
	 * @return driver;
	 */
	public static final WebDriver getDriver() {
		
		if(driver==null || ((RemoteWebDriver)driver).getSessionId()==null) {
			String browser = Config.getProperty("browser");
			
		switch(browser) {
		case "chrome":
			String chromePath = Config.getProperty("chromePath");
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		case "firefox":
			String ffPath = Config.getProperty("ffPath");
			System.setProperty("webdriver.gecko.driver", ffPath);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
			
		default:
			throw new IllegalArgumentException("Error, invalid browser name: Check your properties file");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
		return driver;
	}
/**
 * 
 * @param millis
 */
	public static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		     e.printStackTrace();
		}
	
	}


}
