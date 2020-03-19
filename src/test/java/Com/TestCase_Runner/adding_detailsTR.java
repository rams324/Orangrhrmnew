package Com.TestCase_Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\feature folder\\orange.feature",
tags= {"@tc_02"},
glue= {"stepdefinition"},
monochrome=true
)
public class adding_detailsTR {

}
