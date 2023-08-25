package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
WebDriver driver;

@Given("User is on Login page")
public void User_is_on_Login_pag() {
	driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/login");
}
@When("User enters {string} and {string}")
public void User_enters_and(String strUser, String strPwd) {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
	driver.findElement(By.id("password")).sendKeys(strPwd);
	driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
}
	@Then ("User should be navigated to Home page")
	public void user_should_be_navigated_to_home_page()
	{
	boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	assertTrue(isValid);
	}
	private void assertTrue(boolean isValid) {
		// TODO Auto-generated method stub
		
	}
}