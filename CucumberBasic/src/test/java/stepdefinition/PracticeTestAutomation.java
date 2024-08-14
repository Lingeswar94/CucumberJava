package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PracticeTestAutomation {

	WebDriver driver;

	@Given("User is to login")
	public void user_is_to_login() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("User enter the Username and Password")
	public void user_enter_the_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("student");
		;
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@When("Click the login button")
	public void click_the_login_button() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("User should nativate to home page")
	public void user_should_nativate_to_home_page() {
		String text = driver.findElement(By.tagName("a")).getText();
		System.out.println(text);
		if(text.equals("Log out")) {
			System.out.println("Yes");
		}
	}
}
