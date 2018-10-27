package guru99project;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99project {
	
	ChromeDriver driver;
		
	public void invokechrome() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", "C://Users//A//eclipse-workspace//libs//chromedriver.exe");
		Dimension dim = new Dimension(640,480);
		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4");
		
		
	}
	

}
