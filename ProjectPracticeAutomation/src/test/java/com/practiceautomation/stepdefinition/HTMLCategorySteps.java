package com.practiceautomation.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.excelutility.excel.ExcelUtility;
import com.practiceautomation.pages.HTMLCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HTMLCategorySteps 
{
	WebDriver driver;
	HTMLCategoryPage html;
	ExcelUtility excel = new ExcelUtility();
	
	@Given("^To Launch the chrome browser$")
	public void to_Launch_the_chrome_browser() throws Throwable 
	{
		html = new HTMLCategoryPage(driver);
		html.launchBrowser("chrome");
	}

	@When("^To open the Practice automation website$")
	public void to_open_the_Practice_automation_website() throws Throwable 
	{
		html.openWebsite();
	}

	@Then("^Enter Email and password in login field$")
	public void enter_Email_and_password_in_login_field() throws Throwable 
	{
	    html.loginDetails(excel.username(2),excel.password(2));
	}

	@Then("^Click on the Login Button$")
	public void click_on_the_Login_Button() throws Throwable 
	{
	    html.clickLoginButton();
	}

	@Then("^Click Shop icon, Click HTML and buy the book$")
	public int click_Shop_icon_Click_HTML_and_buy_the_book() throws Throwable 
	{
		Thread.sleep(2000);
		int htmlbook=html.htmlBookCategory();
		System.out.println("Total number of HTML books Available: "+htmlbook);
		Boolean bo;
		if(htmlbook==0)
		{
			bo=false;
			Assert.assertTrue(bo);
			System.out.println("OUT OF STOCK");
		}
		else
		{
			System.out.println(" STOCKS ARE AVAILABLE ,YOU CAN BUY THE BOOK");
		}
		return htmlbook;
	}

	@And("^View the cart html book$")
	public void view_the_cart_html_book() throws Throwable 
	{
		html.viewCartHtml();
	}
}
