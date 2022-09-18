package com.bdd.steps;

import static com.bdd.utils.WebdriverUtils.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demosteps {
	WebDriver cdriver;

	@Given("user navigates to the application")
	public void user_navigates_to_the_application() {
		cdriver = getDriver();
		cdriver.get("https://www.softwaretestinghelp.com");
	}

	@When("user clicks on links {string}")
	public void user_clicks_on_links(String linkName) {
		cdriver.findElement(By.linkText(linkName)).click();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@Then("validate the outcomes")
	public void validate_the_outcomes() {
		String expected = cdriver
				.findElement(
						By.xpath("//*[@class='entry-title' and text()='QA Software Testing Resources and Downloads']"))
				.getText();
		String actual = "QA Software Testing Resources And Downloads";
		Assert.assertEquals(expected, actual);
		cdriver.close();
	}

}
