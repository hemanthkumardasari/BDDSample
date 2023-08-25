package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "src\\test\\resources\\Features\\Features",
			glue = {"stepDefs"},
			monochrome = false,
			dryRun = true,
		plugin = {"pretty"}
		)
public class ParallelExecRunner extends AbstractTestNGCucumberTests{
	@DataProvider(parallel = true)
public Object[][] scenarios () {
		return super.scenarios();
	}
}