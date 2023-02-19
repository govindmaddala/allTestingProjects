package com.Chailntl.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage 
{
	public By wallets=By.xpath("//a[@id='walletlang']");
	public By payNow=By.cssSelector("div.paymentLabel [for='OMISE-OMISE_PAYNOW']");
	public By paymentBtn=By.cssSelector("#PayNowButtonWeb");
	
	public WebElement Wallet(WebDriver driver)
	{
		return driver.findElement(wallets);
	}
	
	public WebElement PayBtn(WebDriver driver)
	{
		return driver.findElement(payNow);
	}
	
	public PaymentDetailsPage FinalPaymentBtn(WebDriver driver)
	{
		driver.findElement(paymentBtn).click();
		return new PaymentDetailsPage();
	}	
}


