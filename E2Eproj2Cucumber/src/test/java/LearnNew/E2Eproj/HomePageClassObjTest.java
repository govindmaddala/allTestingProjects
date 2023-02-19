package LearnNew.E2Eproj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.DriverBase;

public class HomePageClassObjTest
{
	public static Logger log=LogManager.getLogger(HomePageClassObjTest.class.getName());
	DriverBase bi=new DriverBase();
	public WebDriver driver;
	
	@BeforeTest
	public void open() throws IOException
	{
		driver=bi.startBrowser();
		driver.get(bi.prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("HomePageClassObj is executed");
		
	}
	
	
	@Test
	public void homePage()
	{
		//WebDriver driver=bi.startBrowser(); //returns driver
		//driver.get(bi.prop.getProperty("url")); //commented for TestNG //or
		//driver.get("http://www.qaclickacademy.com/");	
		LandingPage lp=new LandingPage();
		try
		{
			lp.popUp(driver).click();
		}
		catch (Exception e)
		{
			
		}	
		lp.getLogin(driver).click();
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
		log.info("HomePageClassObj is done");
	}
}
