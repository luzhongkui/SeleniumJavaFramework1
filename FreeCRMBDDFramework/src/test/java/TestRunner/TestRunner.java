package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\luzhongk\\eclipse-workspace\\FreeCRMBDDFramework\\FreeCRMBDDFramework\\src\\main\\java\\Feature"
		,glue = {"LoginSteps"},
		format = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-xml/cucumber.xml"},
		monochrome = true,
		//strict = true,
		dryRun = false
		//tags= {"~@I"}// ~ igonre
		)


public class TestRunner {

}
