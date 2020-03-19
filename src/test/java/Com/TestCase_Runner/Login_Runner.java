package Com.TestCase_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Feature/Testcase.feature",
plugin = {"pretty","html:reports/cucumber-html-report"},
tags= {"@Tc_17"},
glue= {"steps"},
monochrome=true
)
public class Login_Runner {

}
