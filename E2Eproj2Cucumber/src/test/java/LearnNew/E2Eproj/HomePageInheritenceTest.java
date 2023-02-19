package LearnNew.E2Eproj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.DriverBase;

public class HomePageInheritenceTest extends DriverBase //also can be done using inheritence 
{
	public static Logger log=LogManager.getLogger(HomePageClassObjTest.class.getName());
	public WebDriver driver;
	@BeforeTest
	public void open() throws IOException
	{
		driver=startBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		LandingPage lp=new LandingPage();
		try
		{
			lp.popUp(driver).click();
		}
		catch (Exception e)
		{
			
		}
		lp.getLogin(driver).click();
		log.info("HomePageInheritence is executed");
	}
	
	@Test(dataProvider="dataSet")
	public void homePage(String user,String pass) throws IOException
	{
		//driver= startBrowser();                     //commented for TestNG
		//driver.manage().window().maximize();
//		//driver.get("http://www.qaclickacademy.com/");  or
		//driver.get(prop.getProperty("url"));
//		LandingPage lp=new LandingPage();
//		if(lp.popUp(driver).isDisplayed())
//		{
//			lp.popUp(driver).click();
//		}	
//		lp.getLogin(driver).click(); //landed into login page
		
		LoginPage log=new LoginPage(driver);
		log.userName().sendKeys(user);
		log.passWord().sendKeys(pass);
		log.logIn().click();         //login is done
	}
	
	//data for entering every time 
	@DataProvider
	public Object[][] dataSet()
	{
		Object[][] data=new Object[2][2];
		//for test case-1
		data[0][0]="valid@gmail.com";
		data[0][1]="valid";
		
		//for test case-2
		data[1][0]="invalid@gmail.com";
		data[1][1]="invalid";	
		return data;
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
		log.info("HomePageInheritence is done");
	}
	
}
