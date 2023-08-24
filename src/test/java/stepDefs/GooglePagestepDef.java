package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePagestepDef {
WebDriver driver;

	@Given("User is on Google Page")
	public void user_is_on_google_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get ("https://www.google.com");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getTitle(), "Google" );
		
		 
	}
	@When("I search Java Tutorial")
	public void i_search_java_tutorial() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement srcBox = driver.findElement(By.name("q"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
	}
	
	@Then("Should display Java result page")
	public void should_display_Java_result_page() {
		 String strTitle = driver.getTitle();
			Assert.assertEquals(strTitle, "Java Tutorial - Google Search");  

	}	
		@When("I search Selenium Tutorial")
		public void i_search_selenium_tutorial() {
			WebElement srcBox = driver.findElement(By.name("q"));
			srcBox.sendKeys("Selenium Tutorial");
			srcBox.sendKeys(Keys.ENTER);   
		}
		@Then("Should display Selenium result page")
		public void should_display_selenium_result_page() {
			 String strTitle = driver.getTitle();
		Assert.assertEquals(strTitle, "Selenium Tutorial - Google Search");    
			}
@After
public void attachScreenshot(Scenario scenario) {
	if(scenario.isFailed() ) {
		TakesScreenshot screen = (TakesScreenshot)driver;
		byte[] src = screen.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src,  "image/png", "Scenario Screenshot");
	}
	driver.close();
	}
}
