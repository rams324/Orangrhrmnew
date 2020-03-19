package Com.TestCase_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resourses/feature/orng.feature",
		plugin = {"pretty","html:reports/cucumber-html-report"},
		tags = {"@TC_17"},
		glue = {"stepDefinition"},
		monochrome = true
		)
public class DirectoryTab_Runner {

}
