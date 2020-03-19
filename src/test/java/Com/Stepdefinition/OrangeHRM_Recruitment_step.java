package Com.Stepdefinition;

import Com.pages.OrangeHRM_Recruitment_Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Recruitment_step {
	OrangeHRM_Recruitment_Pages recruit = new OrangeHRM_Recruitment_Pages();
	@Given("^user Launch the chrome browser11$")
	public void user_Launch_the_chrome_browser11() throws Throwable {
	    recruit.ChromeLaunch();
	}

	@When("^user Open the orange hrm login page11$")
	public void user_Open_the_orange_hrm_login_page11() throws Throwable {
	    recruit.OrangeHRM_Homepage();
	}

	@Then("^user Enter the username and password with valid data11$")
	public void user_Enter_the_username_and_password_with_valid_data11() throws Throwable {
	    recruit.LoginDetails();
	}

	@Then("^user Submit the details$")
	public void user_Submit_the_details() throws Throwable {
	   recruit.submit();
	}

	@Then("^user searching the candidate details$")
	public void user_searching_the_candidate_details() throws Throwable {
	    recruit.Search_item();
	}

}
