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
	    driver = new ChromeDriver();
		Dimension dim = new Dimension(640,480);
		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4");			
	}
	
	public void printtitlepage() {
		
		System.out.println(driver.getTitle());		
	}
	
	public void browserclose() {
		
		driver.quit();
	}
	
	public void login (String uname, String pwd) {
	//	WebElement usid = driver.findElement(By.name("uid"));		
	//	usid.sendKeys(uname);
		
	    driver.findElement(By.name("uid")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();
		
	}
		
	public void addcustomer() {
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Sapna");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.id("dob")).sendKeys("07/05/1984");
		driver.findElement(By.name("addr")).sendKeys("whatever address");
		driver.findElement(By.name("city")).sendKeys("Gurgaon");
		driver.findElement(By.name("state")).sendKeys("Haryana");
		driver.findElement(By.name("pinno")).sendKeys("122001");
		driver.findElement(By.name("telephoneno")).sendKeys("9990980218");
		String email = System.currentTimeMillis()+"@gmail.com" ;	
		System.out.println(email);
		driver.findElement(By.name("emailid")).sendKeys(email);	
		driver.findElement(By.name("password")).sendKeys("qwer1234");
		driver.findElement(By.name("sub")).click();
		
	}
	
	public void getcustomeriD () {
		
		
	}

}
