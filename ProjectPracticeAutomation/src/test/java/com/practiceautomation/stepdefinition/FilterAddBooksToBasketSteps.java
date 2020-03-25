package com.practiceautomation.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.excelutility.excel.ExcelUtility;
import com.practiceautomation.pages.FilterAddBooksToBasketPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterAddBooksToBasketSteps 
{
	WebDriver driver;
	FilterAddBooksToBasketPage filter;
	ExcelUtility excel = new ExcelUtility();

	@Given("^Launch the Chrome browser$")
	public void launch_the_Chrome_browser() throws Throwable 
	{
		filter = new FilterAddBooksToBasketPage(driver);
		filter.launchBrowser("chrome");
	}

	@When("^open Practice automation website$")
	public void open_Practice_automation_website() throws Throwable 
	{
		filter.openWebsite();
	}

	@Then("^Enter the Email and password in login$")
	public void enter_the_Email_and_password_in_login() throws Throwable 
	{
	    filter.loginDetails(excel.username(1),excel.password(1));
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable 
	{
	    filter.clickLoginButton();
	}

	@Then("^Click Shop icon and Filter price using Slider$")
	public void click_Shop_icon_and_Filter_price_using_Slider() throws Throwable 
	{
	    Thread .sleep(5000);
		String sliderfilter=filter.sliderFilter();
		String expectedurl="http://practice.automationtesting.in/shop/?min_price=394&max_price=500";
		System.out.println(expectedurl);
		
		Assert.assertEquals(expectedurl, sliderfilter);
	}

	@And("^Add the books to the basket and View the cart$")
	public void add_the_books_to_the_basket_and_View_the_cart() throws Throwable 
	{
	    filter.addToBasketViewCartFilter();
	}
}
