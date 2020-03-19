package Com.Stepdefinition;

import org.openqa.selenium.WebDriver;

import Com.pages.Links;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LinkStep {
	WebDriver driver;
	Links l=new Links();
	@Given("^user launch the chrome Browser5$")
	public void user_launch_the_chrome_Browser5() throws Throwable {
		l.launchbrowser();
	   
	}

	@When("^user open the orangehrm Login page5$")
	public void user_open_the_orangehrm_Login_page5() throws Throwable {
		l.log_page();
	   
	}

	@Then("^user enter the username and password with Valid data5$")
	public void user_enter_the_username_and_password_with_Valid_data5() throws Throwable {
		l.loginData();
	  
	}

	@Then("^user click the Login Button$")
	public void user_click_the_Login_Button() throws Throwable {
		l.submit();

	   
	}

	@Then("^user  click Leave link in the dash borad page$")
	public void user_click_Leave_link_in_the_dash_borad_page() throws Throwable {
		l.click();
	   
	}


}
