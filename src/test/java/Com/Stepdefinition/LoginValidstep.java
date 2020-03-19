package Com.Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.excelUtility.ExcelLoginData;

import Com.pages.LoginValid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginValidstep extends ExcelLoginData{
	WebDriver driver;
	LoginValid logindata=new LoginValid();
	@Given("^user launch the chrome browser1$")
	public void user_launch_the_chrome_browser1() {
		
		logindata.ChromeLaunch();
	}

	@When("^user open the orange hrm login page1$")
	public void user_open_the_orange_hrm_login_page1()  {
		logindata.OpenOrangeHrm();
	}

	@Then("^user enter the username and password with valid data1$")
	public void user_enter_the_username_and_password_with_valid_data1() throws InterruptedException, IOException  {
		logindata.loginData(1);
	}

   @Then("^user click the Login button$")
   public void user_click_the_Login_button() throws Throwable {
  logindata.submit();

   }

}
