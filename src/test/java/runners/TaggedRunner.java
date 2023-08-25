package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//taggedFeature//",
			glue = {"stepDefs"},
			monochrome = true,
			dryRun = true,
//		tags = "@SmokeTest"
//		tags = "@RegressionTest"
//		tags = "@SmokeTest or @RegressionTest"
//		tags = "@SmokeTest and @RegressionTest"	
//		tags = "not @RegressionTest"
		tags = "@PhaseTwo"
		
)
public class TaggedRunner extends AbstractTestNGCucumberTests{
 
  }

