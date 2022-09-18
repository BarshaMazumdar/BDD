package com.bdd.steps;

import static com.bdd.utils.WebdriverUtils.getDriver;

import org.openqa.selenium.WebDriver;

import com.bdd.pageObject.facebookloginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebookloginsteps {
	public WebDriver cdriver;
	public facebookloginPage lp;

	@Given("user navigate to login to the url")
	public void user_navigate_to_login_to_the_url() throws InterruptedException {
		lp = new facebookloginPage(cdriver);
		cdriver = getDriver();
		cdriver.get("https://www.facebook.com/");
		Thread.sleep(3000);

	}

	@When("enter email with {string}  and enter password with {string}")
	public void enter_email_with_and_enter_password_with(String email, String password) {
		lp.SetUserName(email);
		lp.SetPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
		lp.ClickLogin();
	}

	@Then("verify the welcome page")
	public void verify_the_welcome_page() {

	}

	@When("click on logout button")
	public void click_on_logout_button() {
		// lp.ClickLogout();
	}

	@Then("verify the default page")
	public void verify_the_default_page() {
		cdriver.close();

	}

}
