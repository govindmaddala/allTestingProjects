package pageObjects;

import org.openqa.selenium.By;

import resources.BaseClass;

public class IndexPage extends BaseClass
{
	public static By logo=By.cssSelector("[src*='logo']");
	public static By search_bar=By.id("search_query_top");
	public static By searchBtn = By.cssSelector("[name='submit_search']");
	public By signIn=By.cssSelector("[class='login']");
	
}
