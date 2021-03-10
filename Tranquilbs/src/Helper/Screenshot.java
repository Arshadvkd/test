package Helper;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void takescreenshot(WebDriver driver, String filename) {
		
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src= ts.getScreenshotAs(OutputType.FILE);
			
			//FileUtils.copyFile(src,new File("./screenshots/"+filename+".png"));
			
			FileHandler.copy(src, new File("./screenshots/"+filename+".png"));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
		
	}

}
