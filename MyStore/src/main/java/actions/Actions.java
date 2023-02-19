package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.BaseClass;

public class Actions extends BaseClass
{
	public static WebElement isDisplayed(WebDriver driver,By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void sendKeys(WebDriver driver,By locator,String item)
	{
		driver.findElement(locator).clear(); 
		driver.findElement(locator).sendKeys(item);
	}
	
	public static void submit(WebDriver driver,By locator)
	{
		driver.findElement(locator).click();
	}

}
