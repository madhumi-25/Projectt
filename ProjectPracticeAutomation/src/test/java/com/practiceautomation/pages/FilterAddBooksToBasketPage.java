package com.practiceautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FilterAddBooksToBasketPage 
{
	WebDriver driver;
	By myaccountclick = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By loginemail = By.id("username");
	By loginpassword = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");
	By filterslider = By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/div");
	By filterbutton = By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[2]/button");
	By addtobasketbutton = By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]");
	By viewcartbutton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	
	public FilterAddBooksToBasketPage(WebDriver driver) 
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
				System.setProperty("webdriver.gecko.driver","Driver//geckodriver.exe");
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
		public void loginDetails(String username,String password) throws Exception
		{
			driver.findElement(myaccountclick).click();
			Thread.sleep(2000);

			driver.findElement(loginemail).sendKeys(username);	
			driver.findElement(loginpassword).sendKeys(password);
		}
				
		//To click login button
		public void clickLoginButton() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(loginbutton).click();
		}
		
		//To do slider operation in filter 
		public String sliderFilter() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(shopbutton).click();
			
			Thread.sleep(5000);
			WebElement Slider = driver.findElement(filterslider);

			Actions builder = new Actions(driver);
			Action dragAndDrop = builder.clickAndHold(Slider).moveByOffset(40,0).release().build();
			Thread.sleep(5000);
			dragAndDrop.perform(); 
			Thread.sleep(5000);
			driver.findElement(filterbutton).click();
			Thread.sleep(3000);
			String filter =	driver.getCurrentUrl();
			System.out.println(filter);
			return filter;
		}
		
		//To click add to basket button and click view cart
		public void addToBasketViewCartFilter() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(addtobasketbutton).click();	
			Thread.sleep(2000);
			driver.findElement(viewcartbutton).click();
			Thread.sleep(2000);
			driver.close();
		}
}
