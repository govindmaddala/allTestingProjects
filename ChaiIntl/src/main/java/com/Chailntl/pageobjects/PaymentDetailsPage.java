package com.Chailntl.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentDetailsPage 
{
	public static By orderdetailsHeading=By.cssSelector("#headingLang3");
	public static By sellerOrderRef=By.cssSelector("#merchant-order-ref");
	public static By orderRef=By.cssSelector("#order-ref");
	public static By amt=By.cssSelector("#amount-elem");
	
	public String SellerOrderref(WebDriver driver)
	{
		return driver.findElement(sellerOrderRef).getText();
	}
	
	public WebElement OrderDetailElement(WebDriver driver)
	{
		return driver.findElement(orderdetailsHeading);
	}
	
	public String Orderref(WebDriver driver)
	{
		return driver.findElement(orderRef).getText();
	}
	
	public String AmountPaid(WebDriver driver)
	{
		return driver.findElement(amt).getText();
	}
}
