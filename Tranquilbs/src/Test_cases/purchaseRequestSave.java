package Test_cases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import Helper.Screenshot;
import Test_Pages.Menu;
import Test_Pages.Overview;
import Test_Pages.login_page;
import Test_Pages.purchaseRequestList;

public class purchaseRequestSave {
	
	 WebDriver driver;
	
	@Test
	public void PurchaseRequest() throws Exception {
		
		try {
		
		driver = BrowserFactory.startBrowser("FirefoxDriver", "http://111.92.110.196:8084");
		login_page login = PageFactory.initElements(driver, login_page.class);
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		purchaseRequestList purchase = PageFactory.initElements(driver, purchaseRequestList.class);
		
		login.Login("arshad@mail.com", "123456789");
		overview.menu_click();
		menu.clickpurchaseRequest();
		Thread.sleep(100);
		//purchase.click_new_purchase();
		
		
		} catch(Throwable e) {
			
			e.getLocalizedMessage();
		}
		
		
		
		
		
	}
	
	public void tearDown(ITestResult result) {
		
		if(ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(driver, result.getName());
			
		}
		
		driver.close();
	}
	

}
