package LearnNew.E2Eproj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.DriverBase;

public class FailureTest 
{
	public static Logger log=LogManager.getLogger(FailureTest.class.getName()); 
	DriverBase bi=new DriverBase();
	public WebDriver driver;
	
	@BeforeTest
	public void ss() throws IOException
	{
		driver=bi.startBrowser();
		driver.get(bi.prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("HomePageClassObj is executed");
	}
	
	@Test
	public void click()
	{
		LandingPage lp=new LandingPage();
		try
		{
			lp.popUp(driver).click();
		}
		catch (Exception e)
		{
			
		}
		Assert.assertEquals(lp.heading(driver).getText(), "FEATURED COURS");
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
		log.info("TestFail is finished");
	}
}
