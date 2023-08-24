package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SensEmailStepDef {
WebDriver driver;

@Given("User must launch the application")
public void User_must_launch_the_application() {
	driver = new ChromeDriver();
	driver.get("httpUser must launch the applications://www.globalsqa.com/samplepagetest/");
}
@When("user should send email to regsister")
public void user_should_send_email_to_register(String docString) {
	driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys(docString);
		
}
	}
}}
