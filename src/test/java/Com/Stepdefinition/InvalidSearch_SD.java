package Com.Stepdefinition;

import Com.pages.InvalidSearch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidSearch_SD {
	InvalidSearch obj =new InvalidSearch();
	@Given("^Launch the Chrome browser18$")
	public void Launch_the_Chrome_browser18() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.browserLaunch();
	}
	@When("^Open the OrangeHRM Home Page and click on the directory Tab18$")
	public void open_the_OrangeHRM_Home_Page_and_click_on_the_directory_Tab18() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.homePage("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^Enter the valid Data$")
	public void enter_the_valid_Data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.InvalidSearchMethod();
	}

	@Then("^Click on the Search Button$")
	public void click_on_the_Search_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.close();
	}
}
