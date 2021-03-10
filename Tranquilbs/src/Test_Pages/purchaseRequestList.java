package Test_Pages;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class purchaseRequestList {

	
	@FindBy(xpath="//button[@class=\'btn btn-add\']")
	WebElement add_button;
	
	@FindBy(xpath="//div[@class='btn-group tbl-btn-grp open']/button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	java.util.List<WebElement> actions;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu action-drop-list']/li/a")
	java.util.List<WebElement> action_lists;
	
	
	
	
	
	public void click_new_purchase() {
		
		add_button.click();
	}
	
	public void click_action(int index) {
		
		int count = actions.size();
		System.out.println("Total = "+count);
		
		for(int i=0; i<=count; i++) {
			
			WebElement el = actions.get(index);
			{
				el.click();
				break;
			}
		}
	}
	
	public void click_view() throws Exception{
		
		
		int size = action_lists.size();
		
		
		for(int i=0; i<=size;i++) {
			
			WebElement ele = action_lists.get(i);
			
			String click_view = ele.getAttribute("innerHTML");
			
			if(click_view.contentEquals("View")) {
				
				ele.click();
			}
			
		}
	}
	
}
