package com.storeauto.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.storeauto.actiondriver.Action;
import com.storeauto.base.BaseClass;

public class IndexPage extends BaseClass
{
	@FindBy(css="[class='login']") WebElement signIn;
	@FindBy(xpath="//img[starts-with(@class,'logo')]") WebElement logo;
	@FindBy(id="search_query_top") WebElement searchBar;
	@FindBy(name="submit_search") WebElement searchBtn;
	
	
	//Constructor to activate above variables using PageFactory
	public IndexPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public LoginPage clickSignIn()
	{
		Action.click(getDriver(), signIn);
		return new LoginPage();
	}
	
	public boolean validateLogo()
	{
		return Action.isDisplayed(getDriver(), logo);
	}
	
	public SearchItemPage searchItem(String itemName)
	{
		Action.type(searchBar, itemName);
		Action.click(getDriver(), searchBtn);
		return new SearchItemPage();
	}
	
	public String validateTitle()
	{
		String pageTitle=getDriver().getTitle();
		return pageTitle;
	}
	
	

}
