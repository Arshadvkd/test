package Test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserFactory;
import Test_Pages.Menu;
import Test_Pages.login_page;
import Test_Pages.request_test_pages;

public class leaveRequest {
	
	WebDriver driver;
	
	public void request() {
		
		try {
		
		driver = BrowserFactory.startBrowser("FirefoxDriver", "http://111.92.110.196:8099/");
		login_page login = PageFactory.initElements(driver, login_page.class);
		
		request_test_pages request = PageFactory.initElements(driver, request_test_pages.class);
		
		login.Login("esstest@mail.com", "123456789");
		
		
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
		

}
