package com.Chailntl.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage 
{
	public static By fullName=By.cssSelector("[name='fullName']");
	public static By email=By.cssSelector("[name='email']");
	public static By phoneNum=By.cssSelector("[placeholder='Phone Number']");
	public static By payBtn=By.cssSelector(".jss11 button");
	
	public WebElement FullName(WebDriver driver)
	{
		return driver.findElement(fullName);
	}
	public WebElement email(WebDriver driver)
	{
		return driver.findElement(email);
	}
	public WebElement phoneNum(WebDriver driver)
	{
		return driver.findElement(phoneNum);
	}
	public PaymentPage payBtn(WebDriver driver)
	{
		driver.findElement(payBtn).click();
		return new PaymentPage();
	}
	
}
