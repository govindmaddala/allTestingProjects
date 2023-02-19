package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageOptiForgotPage 
{
	By userName=By.id("user_email");
	By sendinstructions=By.cssSelector("input[type='submit']");
	
	public WebElement userReset(WebDriver driver)
	{
		return driver.findElement(userName);
	}
	public void sendInstruct(WebDriver driver)
	{
		driver.findElement(sendinstructions).click();
	}
}
