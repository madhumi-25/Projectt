package com.practiceautomation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.excelutility.excel.ExcelUtility;
import com.practiceautomation.pages.IncreaseQuantityPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncreaseQuantitySteps 
{
	WebDriver driver;
	IncreaseQuantityPage quantity;
	ExcelUtility excel= new ExcelUtility();

	@Given("^Launch the chrome browser in system$")
	public void launch_the_chrome_browser_in_system() throws Throwable 
	{
		quantity = new IncreaseQuantityPage(driver);
		quantity.launchBrowser("chrome");
	}

	@When("^To open Practice automation website$")
	public void to_open_Practice_automation_website() throws Throwable 
	{
		quantity.openWebsite();
	}

	@Then("^Enter Email and password in Login$")
	public void enter_Email_and_password_in_Login() throws Throwable
	{
	    quantity.loginDetails(excel.username(3), excel.password(3));
	}

	@Then("^Clicking Login Button$")
	public void clicking_Login_Button() throws Throwable 
	{
	    quantity.clickLoginButton();
	}

	@Then("^Click Shop icon  Click HTML and buy the book$")
	public void click_Shop_icon_Click_HTML_and_buy_the_book() throws Throwable 
	{
	    quantity.htmlBookCategory();
	}

	@And("^View the cart, Increase quantity and update$")
	public void view_the_cart_Increase_quantity_and_update() throws Throwable 
	{
		quantity.quantityUpdate();
	}
}
