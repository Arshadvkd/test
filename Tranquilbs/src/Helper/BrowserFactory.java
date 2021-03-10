package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String Browsername, String url) {
		
		if(Browsername.equalsIgnoreCase("FirefoxDriver")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

}
