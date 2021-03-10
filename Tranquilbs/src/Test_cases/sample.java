package Test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.BrowserFactory;

public class sample {
	
	WebDriver driver;
	
	@Test
	public void test() {
		
		driver = BrowserFactory.startBrowser("FirefoxDriver", "https://www.google.com/");
		
		
		String actual_title = driver.getTitle();
		
		System.out.println("Title is "+actual_title);
		
		String expected_title = "Google";
		
		Assert.assertEquals(actual_title, expected_title);
		
		
	}

}
