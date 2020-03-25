package com.practiceautomation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.excelutility.excel.ExcelUtility;
import com.practiceautomation.pages.BillingDetailsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BillingDetailsSteps 
{
	WebDriver driver;
	BillingDetailsPage details;
	ExcelUtility excel = new ExcelUtility();
	
	@Given("^Launch the chrome application$")
	public void launch_the_chrome_application() throws Throwable
	{
		details = new BillingDetailsPage(driver);
	    details.launchBrowser("chrome");
	}

	@When("^To open Practice Automation  Website$")
	public void to_open_Practice_Automation_Website() throws Throwable 
	{
		details.openWebsite();
	}

	@Then("^Enter the Email and password in Login field$")
	public void enter_the_Email_and_password_in_Login_field() throws Throwable 
	{
		details.loginDetails(excel.username(1),excel.password(1));
	}

	@Then("^Clicking on Login Button$")
	public void clicking_on_Login_Button() throws Throwable 
	{
	    details.clickLoginButton();
	}

	@Then("^Click Shop button  Click Selenium, buy the book and View cart$")
	public void click_Shop_button_Click_Selenium_buy_the_book_and_View_cart() throws Throwable 
	{
	    details.seleniumBookCategoryPurchase();
	}

	@Then("^Click proceed to checkout, enter the mandatory details in billing details and click place order$")
	public void click_proceed_to_checkout_enter_the_mandatory_details_in_billing_details_and_click_place_order() throws Throwable 
	{
	    details.billingDetails();
	}

	@And("^Take Screenshot if mandatory fields are mising$")
	public void take_Screenshot_if_mandatory_fields_are_mising() throws Throwable 
	{
	    details.screenshot();
	}
}
