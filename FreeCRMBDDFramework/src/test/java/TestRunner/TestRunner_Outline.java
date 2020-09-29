package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\luzhongk\\eclipse-workspace\\FreeCRMBDDFramework\\FreeCRMBDDFramework\\src\\test\\java\\Feature_Outline"
		,glue = {"LoginSteps_Outline"},
		format = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-xml/testng-results.xml"},
		monochrome = true,
		//strict = true,
		dryRun = false,
		tags= {"~@Without"}  // ~ igonre
		)


public class TestRunner_Outline {

}
