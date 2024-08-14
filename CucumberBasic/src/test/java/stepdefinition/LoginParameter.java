package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginParameter {

	WebDriver driver;

	@Given("User is to login with loginpage")
	public void user_is_to_login_with_loginpage() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("User is to enter the {string} and {string}")
	public void user_is_to_enter_the_and(String Username, String Password) {
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
	}

	@When("User is to Click the login button")
	public void user_is_to_click_the_login_button() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("User should nativate to home page and verfiy")
	public void user_should_nativate_to_home_page_and_verfiy() {
		String text = driver.findElement(By.tagName("a")).getText();
		System.out.println(text);
		if(text.equals("Log out")) {
			System.out.println("Yes");
		}
	}

}
