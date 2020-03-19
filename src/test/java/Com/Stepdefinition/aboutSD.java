package Com.Stepdefinition;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Com.pages.about;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class aboutSD
{
	WebDriver driver;
	about page4=new about();
	
	@Given("^launcing the application via chrome browser8$")
	public void launcing_the_application_via_chrome_browser8() 
	{
		page4.login_page(); 
	}
	@When("^login with valid details8$")
	public void login_with_valid_details8() 
	{
		page4.login_details4() ;
	}

	@Then("^user is able to know about orange hrm application$")
	public void user_is_able_to_know_about_orange_hrm_application()
	{
		page4.about_HRM();
	}
	
	@Then("^take the screenshot of about page$")
	public void take_the_screenshot_of_about_page() throws IOException 
	{
		page4.screenshot("D:\\projectall-master\\projectall-master\\Screenshot\\1.png");
	}

}
