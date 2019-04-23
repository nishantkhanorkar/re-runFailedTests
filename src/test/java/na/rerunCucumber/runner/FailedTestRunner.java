package na.rerunCucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"@target/rerun.txt"},
	glue = {"na.rerunCucumber.stepDef" },
	dryRun = false
	)

public class FailedTestRunner {

}
