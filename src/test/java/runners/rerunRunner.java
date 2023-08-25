package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "src\\test\\resources\\Features\\GooglePageSearch.feature",
			glue = {"stepDefs"},
			monochrome = true,
			dryRun = true,
		plugin = {"pretty"}
		)
public class rerunRunner extends AbstractTestNGCucumberTests{
}

