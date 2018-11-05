package guru99project;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Workwithfirefox {

    
		public FirefoxDriver driver;
		
		public void invokefirefox() {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\A\\eclipse-workspace\\libs\\geckodriver.exe");
		 driver = new FirefoxDriver();
			Dimension dim = new Dimension(640,480);
			driver.manage().window().setSize(dim);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://demo.guru99.com/v4");		
			
		}
		
		
				public void exitff() {
					
					driver.quit();
				}


     
	}


