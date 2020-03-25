package com.practiceautomation.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IncreaseQuantityPage 
{
	WebDriver driver;
	
	By myaccountclick = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By loginemail = By.id("username");
	By loginpassword = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");
	By quantityclick = By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input");
	By updatebutton = By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[3]/td/input[1]");
	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By htmlcategoryclick = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[2]/a");
	By viewcartbutton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	By htmladdtobasket1 = By.xpath("//*[@id=\"content\"]/ul/li[1]/a[2]");
	By htmladdtobasket2 = By.xpath("//*[@id=\"content\"]/ul/li[3]/a[2]");
	
	public IncreaseQuantityPage(WebDriver driver) 
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
	
		//To click HTML book category and add books to the cart
		public void htmlBookCategory() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.findElement(shopbutton).click();
			
			Thread.sleep(5000);
			driver.findElement(htmlcategoryclick).click();
			Thread.sleep(3000);
			driver.findElement(htmladdtobasket1).click();
			driver.findElement(htmladdtobasket2).click();
			
		}
		
		//To increase quantity in view cart and update the basket
		public void quantityUpdate() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(viewcartbutton).click();
			
			Thread.sleep(5000);
			driver.findElement(quantityclick).click();
					
			Thread.sleep(5000);
			driver.findElement(quantityclick).clear();
			driver.findElement(quantityclick).sendKeys("3");
					
			Thread.sleep(5000);
			driver.findElement(updatebutton).click();
			
			Thread.sleep(3000);
			driver.close();
		}
}
