package dragndrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\A\\eclipse-workspace\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement sc = driver.findElement(By.id("draggable"));
		WebElement tg = driver.findElement(By.id("droppable"));
		Actions ac = new Actions (driver);
		ac.dragAndDrop(sc, tg).build().perform();
		driver.quit();
		
	}

}
