package com.storeauto.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.storeauto.actiondriver.Action;
import com.storeauto.base.BaseClass;

public class HomePage extends BaseClass
{
	@FindBy(css="[href*='mywishlis']") WebElement wishList;
	@FindBy(css="[title='Orders']") WebElement orderHistory;
	
	public boolean wishList()
	{
		return Action.isDisplayed(getDriver(), wishList);
	}
	
	public boolean orderHistory()
	{
		return Action.isDisplayed(getDriver(), orderHistory);
	}
}
