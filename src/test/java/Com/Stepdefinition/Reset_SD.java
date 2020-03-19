package Com.Stepdefinition;


import Com.pages.Reset;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Reset_SD {
	Reset obj = new Reset();
	@Given("^Launch the chrome Browser19$")
	public void Launch_the_chrome_Browser19() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.browserLaunch();
	}
	@When("^Open the OrangeHRM Home Page and click on the DirectoryTab19$")
	public void open_the_OrangeHRM_Home_Page_and_click_on_the_DirectoryTab19() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.homePage("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^Enter the invalid data$")
	public void enter_the_invalid_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.ResetMethod();
	}

	@Then("^Click on the Reset Button$")
	public void click_on_the_Reset_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.close();
	}
}


