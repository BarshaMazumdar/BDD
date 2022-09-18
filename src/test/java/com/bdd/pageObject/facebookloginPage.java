package com.bdd.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookloginPage {

	public WebDriver driver;

	public facebookloginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")
	@CacheLookup
	WebElement txtemail;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(id = "u_0_b_YQ")
	@CacheLookup
	WebElement btnlogin;

	public void SetUserName(String uname) {
		//txtemail.clear();
		txtemail.sendKeys(uname);
	}

	public void SetPassword(String pwd) {
		//txtpassword.clear();
		txtpassword.sendKeys(pwd);
	}

	public void ClickLogin() {
		btnlogin.click();
	}

	// public void ClickLogout() {
	// btnlogout.click();
	// }
}
