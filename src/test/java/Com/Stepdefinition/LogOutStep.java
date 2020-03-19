package Com.Stepdefinition;

import org.openqa.selenium.WebDriver;

import Com.pages.Logout;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LogOutStep {
	WebDriver driver;
	 Logout lo=new  Logout();
	@Given("^user launch the Chrome Browser20$")
	public void user_launch_the_Chrome_Browser20() throws Throwable {
		lo.launch();
	   
	}
	@When("^user open the orangehrm login Page20$")
	public void user_open_the_orangehrm_login_Page20() throws Throwable {
	    lo.Home_page();
	}

	@Then("^user enter the username and password with valid Data20$")
	public void user_enter_the_username_and_password_with_valid_Data20() throws Throwable {
	  lo.loginData();
	}

	@Then("^user click on the Login button$")
	public void user_click_on_the_Login_button() throws Throwable {
		lo.submit();
	   
	}

	@Then("^user click the logout button$")
	public void user_click_the_logout_button() throws Throwable {
		lo.LogOut();
	    
	}




}
