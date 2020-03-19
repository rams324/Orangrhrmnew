package Com.Stepdefinition;

import java.sql.Driver;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Com.pages.Footer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FooterStep {
	WebDriver driver;
	Footer f=new Footer();
	@Given("^user Launch the chrome browser4$")
	public void user_Launch_the_chrome_browser4() throws Throwable {
		f.launch();
	    
	}

	@When("^user open the orangeHrm login page4$")
	public void user_open_the_orangeHrm_login_page4() throws Throwable {
		f.Home_page();
	  
	}

	@Then("^User enter the username and password with valid data4$")
	public void user_enter_the_username_and_password_with_valid_data4() throws Throwable {
		f.loginData();
		
	}

	@Then("^User click the Login button$")
	public void user_click_the_Login_button() throws Throwable {
		f.submit();
	   
	}

	@Then("^compare the footer content$")
	public void compare_the_footer_content() throws Throwable {
	 
	   f.getdata();
	}

}
