package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogle {

	WebDriver  driver;
	
	
	@Given("User is to open google browser")
	public void user_is_to_open_google_browser() {
	
	   driver=new ChromeDriver();
	   driver.navigate().to("https://www.google.com/");
	}

	@When("type the search term as {string}")
	public void user_click_search_button(String string) {
		 driver.findElement(By.name("q")).sendKeys(string);
	}

	@When("User click search button")
	public void type_the_search_term_as() {
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);;
	}

	@Then("the user should be see search result")
	public void the_user_should_be_see_search_result() {
		 boolean status= driver.findElement(By.partialLinkText("Automation")).isDisplayed();
		  Assert.assertTrue(status); 
		  }
}
