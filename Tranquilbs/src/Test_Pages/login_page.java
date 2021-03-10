/**
 * 
 */
package Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author user
 *
 */
public class login_page {
	
	WebDriver driver;
	
	public login_page(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
	
	@FindBy(id="txtUserName")
	WebElement user_name;
	
	@FindBy(id="txtPassword")
	WebElement user_pwd;
	
	@FindBy(id="saveButton")
	WebElement login_button;
	
	public void Login(String username, String Pwd) {
		
		user_name.sendKeys(username);
		user_pwd.sendKeys(Pwd);
		login_button.click();
		
	}

}
