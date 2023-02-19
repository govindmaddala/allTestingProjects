package com.prac.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public By search = By.cssSelector(".form-control.input-lg");
	
	public WebElement search(WebDriver driver) {
		return driver.findElement(search);
	}

}
