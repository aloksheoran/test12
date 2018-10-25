package sel;

import org.openqa.selenium.chrome.ChromeDriver;

public class demoworkwithchrome {

		ChromeDriver driver = new ChromeDriver() ;
        
		void invokechrome() {
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/A/eclipse-workspace/libs/chromedriver.exe");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://google.com");
		
		}
		
		
	}


