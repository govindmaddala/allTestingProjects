package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageOptiLandingPage 
{
	By signin=By.linkText("Login");
	By pop=By.xpath("//button[text()='NO THANKS']");
	By heading=By.xpath("//section[@id='content']/div/div/h2");
	
	public PageOptiLoginPage getLogin(WebDriver driver)
	{
		try
		{
			driver.findElement(pop).click();
		}
		catch (Exception e)
		{
			//System.out.println(e);
		}
		
		driver.findElement(signin).click();
		return new PageOptiLoginPage();  //returns obj of PageOpti_LoginPage
	}
}
