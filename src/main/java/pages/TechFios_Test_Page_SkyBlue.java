package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFios_Test_Page_SkyBlue {
	
	WebDriver driver;

	public TechFios_Test_Page_SkyBlue(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Set SkyBlue Background']") WebElement clickSetSkyBlueBackground;
	
	public void userShouldclickSetSkyBlue() {
		clickSetSkyBlueBackground.click();

	}

}
