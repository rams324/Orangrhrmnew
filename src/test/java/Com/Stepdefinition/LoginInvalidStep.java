package Com.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.excelUtility.LoginInvaliddata;

import Com.pages.LoginInvalid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginInvalidStep extends LoginInvaliddata {
	WebDriver driver;
	LoginInvalid plo=new LoginInvalid();
	@Given("^the user launch the chrome browser2$")
	public void the_user_launch_the_chrome_browser2() throws Throwable {
	   plo.launch();
	}

	@When("^the user open the orange hrm login page2$")
	public void the_user_open_the_orange_hrm_login_page2() throws Throwable {
	    plo.Home_page();
	}

	@Then("^user enter the username and password with invalid data2$")
	public void user_enter_the_username_and_password_with_invalid_data2() throws Throwable {
	    plo.loginData(1);
	}

	@Then("^the user click the Login button$")
	public void the_user_click_the_Login_button() throws Throwable {
	    plo.submit();

	}

}
