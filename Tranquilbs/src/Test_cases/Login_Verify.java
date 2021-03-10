/**
 * 
 */
package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import Test_Pages.Menu;
import Test_Pages.Overview;
import Test_Pages.login_page;

/**
 * @author user
 *
 */

@Test
public class Login_Verify {
	
	WebDriver driver;
	
	
	public void check_user() {
		
		try {
			
			WebDriver driver = BrowserFactory.startBrowser("FirefoxDriver", "http://111.92.110.196:8084");
			login_page login = PageFactory.initElements(driver, login_page.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu		= PageFactory.initElements(driver, Menu.class);
			
			
			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			
			//Assert.assertTrue(driver.getCurrentUrl().contains("Dashboard"));
			overview.menu_click();
			menu.clickpurchaseRequest();
			
			
			System.out.println("Login Successfull");
			
		}catch(Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	
}
