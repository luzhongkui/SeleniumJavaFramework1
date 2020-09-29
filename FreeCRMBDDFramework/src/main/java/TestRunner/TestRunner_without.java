package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\luzhongk\\eclipse-workspace\\FreeCRMBDDFramework\\FreeCRMBDDFramework\\src\\main\\java\\Feature_Without"
		,glue = {"LoginSteps_Without"},
		format = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-xml/cucumber.xml"},
		monochrome = true,
		//strict = true,
		dryRun = false,
		tags= {"~@Without"}  // ~ igonre
		)


public class TestRunner_without {

}
