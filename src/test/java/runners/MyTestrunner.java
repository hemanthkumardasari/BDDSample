package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\Features\\UserLogin.feature",
			glue = {"stepDefs"},
			monochrome = true,
			dryRun = true,
		plugin = {"pretty",
		"html:target/reports/HtmlReport.html",
		"usage:target/reports/UsageReport",
		"json:target/report/JsonReport.json",
		"junit:target/report/JUnitReport.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"return:target/failedScenarios.txt"
		}
		
)
public class MyTestrunner extends AbstractTestNGCucumberTests{
 
  }

