package guru99project;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99project {
	
 public WebDriver driver;
		
	public void invokechrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\eclipse-workspace\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension dim = new Dimension(640,480);
		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4");			
	}
	
	public void printtitlepage() {
		
		System.out.println(driver.getTitle());		
	}
	
	public void login (String uname, String pwd) {
		WebElement usid = driver.findElement(By.name("uid"));		
		usid.sendKeys(uname);
		
	 //   driver.findElement(By.name("uid")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();
		
		
		
	}

}
