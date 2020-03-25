package com.practiceautomation.stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.practiceautomation.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	WebDriver driver;
	public LoginPage login;
	
	@Given("^The user launch the Chrome application$")
	public void the_user_launch_the_Chrome_application() throws Throwable 
	{
		login = new LoginPage(driver);
		login.launchBrowser("chrome");
	}

	@When("^Open the Practice automation website$")
	public void open_the_Practice_automation_website() throws Throwable 
	{
		login.openWebsite();
	}

	@Then("^Enter valid and invalid \"([^\"]*)\" and \"([^\"]*)\" in Login$")
	public void enter_valid_and_invalid_and_in_Login(String email, String password) throws Throwable
	{
		
		login.loginDetails(email,password);
	    Thread.sleep(3000);
	}

	@Then("^Click login button$")
	public void click_login_button() throws Throwable 
	{
	    login.clickLoginButton();
	}
}
