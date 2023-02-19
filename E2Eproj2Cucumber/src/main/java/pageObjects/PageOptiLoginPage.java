package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageOptiLoginPage 
{
	By user=By.id("user_email");
	By password=By.id("user_password");
	By log=By.cssSelector("[type='submit']");
	By forgotPass=By.xpath("//a[contains(text(),'Forgot Password?')]");
	
	public WebElement userName(WebDriver driver)
	{
		return driver.findElement(user);
	}
	
	public WebElement passWord(WebDriver driver)
	{
		return driver.findElement(password);
	}
	
	public void logIn(WebDriver driver)
	{
		driver.findElement(log).click();
		
	}
	
	public PageOptiForgotPage forgotPassword(WebDriver driver)
	{
		driver.findElement(forgotPass).click();
		return new PageOptiForgotPage();
	}
}
