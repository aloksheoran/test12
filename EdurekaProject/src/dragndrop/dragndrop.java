package dragndrop;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dragndrop {
	
	public static void main (String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\A\\eclipse-workspace\\libs\\geckodriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		
		
	}

}
