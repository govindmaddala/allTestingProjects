import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions.Actions;
import pageObjects.IndexPage;
import resources.BaseClass;

public class IndexPageTest extends BaseClass
{
	public WebDriver driver;
	@BeforeTest
	public void webSetUp() throws IOException
	{
		driver=invokeDriver();
		driver.manage().window().maximize();
		String url=prop.getProperty("url");
		driver.get(url);
	}
	
	@Test
	public void imgValidate() throws IOException
	{
		boolean flag=Actions.isDisplayed(driver, IndexPage.logo).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void searchItem()
	{
		String item="T-Shirt";
		Actions.sendKeys(driver, IndexPage.search_bar, item);
		Actions.submit(driver, IndexPage.searchBtn);
	}
	
	@AfterTest
	public void tearDown()
	{	
		driver.close();
	}
}
