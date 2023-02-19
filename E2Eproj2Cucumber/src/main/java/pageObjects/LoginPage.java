package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver browser;
	public LoginPage(WebDriver driver)
	{
		this.browser=driver;
	}
	By user=By.id("user_email");
	By password=By.id("user_password");
	By log=By.cssSelector("[type='submit']");
	
	public WebElement userName()
	{
		return browser.findElement(user);
	}
	
	public WebElement passWord()
	{
		return browser.findElement(password);
	}
	
	public WebElement logIn()
	{
		return browser.findElement(log);
	}	
}