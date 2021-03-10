/**
 * 
 */
package Test_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author user
 *
 */
public class Overview {
	
	
	@FindBy(xpath="//a[@id='main-nav']")
	WebElement menu;
	
	@FindBy(id="divCurrentProfit")
	WebElement Grossprofit;
	
	@FindBy(id="/span[@id='divLastMonthProfit']")
	WebElement Lastmonthprofit;
	
	public void menu_click() {
		
		menu.click();
	}
	

}
