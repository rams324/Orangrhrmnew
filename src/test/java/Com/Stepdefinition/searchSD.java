package Com.Stepdefinition;

import org.openqa.selenium.WebDriver;

import Com.pages.search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchSD
{
	WebDriver driver;
	search page5=new search();
	

@Given("^user launch the chrome browser9$")
public void user_launch_the_chrome_browser9()
{
	page5.chromelaunching5(); 
}

@When("^user open the orange hrm login page9$")
public void user_open_the_orange_hrm_login_page9() 
{
	page5.orangeHRM_homePage5();
}

@Then("^login with valid details9$")
public void login_with_valid_details9() 
{
	page5.login_details5(); 
}
@Then("^searching for employee in the admin page$")
public void searching_for_employee_in_the_admin_page()
{
	page5.searching();
}
}
