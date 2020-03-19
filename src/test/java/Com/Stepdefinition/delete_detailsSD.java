package Com.Stepdefinition;

import org.openqa.selenium.WebDriver;

import Com.pages.delete_details;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class delete_detailsSD
{
	WebDriver driver;
	delete_details page3=new delete_details();
	
	@Given("^user launch the chrome browser7$")
	public void user_launch_the_chrome_browser7() 
	{
		page3.chromelaunching3() ;
	  
	}

	@When("^user open the orange hrm login page7$")
	public void user_open_the_orange_hrm_login_page7()
	{
		page3.orangeHRM_homePage3();
	}

	
	
	@Then("^login with required details7$")

	public void login_with_required_details7()
	{
		page3.login_details3()  ;  
		
	}

	@Then("^user is able to delet the  admin in the admin page$")
	public void user_is_able_to_delet_the_admin_in_the_admin_page() 
	{
	  page3.delete_requirements() ;
		
	}

}
