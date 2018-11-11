package flipkartdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartmethods {
	
	public FirefoxDriver driver;
	
	
	public void invokefirefoxflipkart () {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\A\\eclipse-workspace\\libs\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Dimension dim = new Dimension(640,480);
		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
	//	driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
	}
	
	public void closelogin () {
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
	}
	
	
	public void exitfirefoxflipkart () {
		driver.quit();	
				
	}
	
	public void searchlaptop () {
		
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("laptop");

		driver.findElement(By.xpath("//div[contains(text(),'Popularity')]")).click();
	}
	

}
