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

public class ValidatingObjectsTest extends DriverBase //also can be done using inheritence 
{ 
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(HomePageClassObjTest.class.getName());
	@BeforeTest
	public void open() throws IOException
	{
		driver= startBrowser();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("ValidatingObjects is executed");
	}	
	
	
	@Test
	public void homePage() throws IOException
	{
//		driver= startBrowser();							
//commented for TestNG
//		driver.manage().window().maximize();
//		//driver.get("http://www.qaclickacademy.com/");
//		driver.get(prop.getProperty("url"));
		LandingPage lp=new LandingPage();
		try
		{
			lp.popUp(driver).click();
		}
		catch (Exception e)
		{
			
		}
		
		//validating text over courses
		Assert.assertEquals(lp.heading(driver).getText(), "FEATURED COURSES"); 
	}
	

	@AfterTest
	public void close() throws IOException
	{
		driver.close();
		log.info("ValidatingObjects is done");
	}
	
}
