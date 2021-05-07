package utils;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	
	
	  static WebDriver driver;
	
	 @Test
	  public static  WebDriver init() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	

		driver.get(" http://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		// driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	
		
	
		

	}
	  
}
	
	


