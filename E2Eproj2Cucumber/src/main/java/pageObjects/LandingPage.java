package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
	By signin=By.linkText("Login");
	By pop=By.xpath("//button[text()='NO THANKS']");
	By heading=By.xpath("//section[@id='content']/div/div/h2");
	
	/*
	 WebDriver driver
	 LandingPage(WebDriver driver) //this enables to pass driver value to WebDriver
	 {
	 	this.driver=driver;
	 }
	public WebElement popUp()
	{
		return driver.findElement(pop);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	
	if we write code in above manner then we have to call this constructor in another 
	page where we have to use these methods as following manner
	
	LandingPage obj=new LandingPage(driver);
	  
	 */
	
	public WebElement popUp(WebDriver driver)
	{
		return driver.findElement(pop);   
	}
	
	public  WebElement getLogin(WebDriver driver)
	{
		return driver.findElement(signin);
	}
	public WebElement heading(WebDriver driver)
	{
		return driver.findElement(heading);
	}
}
