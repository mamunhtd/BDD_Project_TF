package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.TechFios_Test_Page_White;

public class TechFios_Test_White_StepDefinitions {
	

	WebDriver driver;
	TechFios_Test_Page_White techFios_Test_Page_White;
	
	@Before
	public void beforeRun() {
		
		driver = utils.BrowserFactory.init();
		techFios_Test_Page_White = PageFactory.initElements(driver, TechFios_Test_Page_White.class);
	
	}


@Given("^User should go the techfios test page$")
public void user_should_go_the_techfios_test_page() throws Throwable {
   
	driver.get("http://techfios.com/test/101/");
	
}

@When("^I click on the button$")
public void i_click_on_the_button() throws Throwable {
	
	techFios_Test_Page_White.userShouldclickSetWhite();
	
}


@Then("^The background color will change to White$")
public void the_background_color_will_change_to_White() throws Throwable {
  
}



}
