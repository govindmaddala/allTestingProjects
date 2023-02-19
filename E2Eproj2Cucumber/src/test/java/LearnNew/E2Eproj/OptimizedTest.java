package LearnNew.E2Eproj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjects.PageOptiForgotPage;
import pageObjects.PageOptiLandingPage;
import pageObjects.PageOptiLoginPage;
import resources.DriverBase;

public class OptimizedTest 
{
	public static Logger log=LogManager.getLogger(OptimizedTest.class.getName());
	public WebDriver driver;
	DriverBase db=new DriverBase();
	
	@BeforeTest
	public void optiTest() throws IOException
	{
		log.info("OptimizedTest is started");
		//driver accessing
		driver=db.startBrowser();
		//homePage accessing
		driver.get(db.prop.getProperty("url"));
		PageOptiLandingPage hp=new PageOptiLandingPage();
		PageOptiLoginPage lp=hp.getLogin(driver);
		//loginPage accessing
		lp.userName(driver).sendKeys("validmail@gmail.com");
		lp.passWord(driver).sendKeys("password");
		lp.logIn(driver);
		PageOptiForgotPage fp=lp.forgotPassword(driver);
		fp.userReset(driver).sendKeys("invalidmail@gmail.com");
		fp.sendInstruct(driver);
	}
	
	@AfterTest
	public void close()
	{
		log.info("OptimizedTest is completed");
		driver.close();
	}
}
