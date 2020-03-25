package com.practiceautomation.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage 
{
	WebDriver driver;
	
	By myaccountclick = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By loginemail = By.id("username");
	By loginpassword = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void launchBrowser(String browser)
	{
		try 
		{
			//To launch firefox Browser
			if (browser.equalsIgnoreCase("firefox")) 
			{
				System.setProperty("webdriver.gecko.driver","Drivers//geckodriver.exe");
				driver = new FirefoxDriver();
			}
			// To launch Chrome Browser
			else if (browser.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
				driver=new ChromeDriver();
			}
			
		} 
		catch (WebDriverException e) 
		{
			System.out.println("Browser could not be launched");
		}
	}
			
		//To open Practice Automation WebSite
		public void openWebsite() throws InterruptedException 
		{
			driver.get("http://practice.automationtesting.in/");
			System.out.println(driver.getTitle());
			//To maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		//To enter login details
		public void loginDetails(String email,String password) throws Exception
		{
			Thread.sleep(3000);
			driver.findElement(myaccountclick).click();
			Thread.sleep(5000);
			driver.findElement(loginemail).sendKeys(email);	
			driver.findElement(loginpassword).sendKeys(password);
			
		}
		                                                          
		//To click login button and close the browser
		public void clickLoginButton() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(loginbutton).click();
			Thread.sleep(3000);
			driver.close();
		}
		
}
