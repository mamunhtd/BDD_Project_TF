package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFios_Test_Page_White {
	
	WebDriver driver;

	public TechFios_Test_Page_White(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Set White Background']']") WebElement clickWhiteBackgroun;
	
	public void userShouldclickSetWhite() {
		clickWhiteBackgroun.click();

	}
	

}
