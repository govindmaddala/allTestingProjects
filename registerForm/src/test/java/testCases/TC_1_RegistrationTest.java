package testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Signup;
import resources.BaseDriver;

public class TC_1_RegistrationTest extends BaseDriver
{
	public static Logger log=LogManager.getLogger(TC_1_RegistrationTest.class.getName());
	public WebDriver driver;
	Signup sign=new Signup();
	
	@BeforeMethod
	public void registerform() throws IOException
	{
		driver= invokedriver();
		driver.manage().window().maximize();
		log.info("Browser is invoked for TC_1_RegistrationTest");
		driver.get(prop.getProperty("url"));
	}
	
	@Test(dataProvider="dataset")
	public void details(String fname,String lname,String mail,String pwd,String code,String phn,String month,String day,String year,String gender) throws IOException
	{
		driver.findElement(sign.fname).sendKeys(fname);  
		driver.findElement(sign.lname).sendKeys(lname);  
		driver.findElement(sign.mail).sendKeys(mail);	
		driver.findElement(sign.pwd).sendKeys(pwd);		
		
		WebElement list=driver.findElement(sign.code);   
		Select drop=new Select(list);
		drop.selectByValue(code);
		
		
		if(phn.length()==10)							
		{
			driver.findElement(sign.phn).sendKeys(phn);
			log.info("required details are passed and mobile number is verified and submitted");
		}
		else
		{
			Assert.assertTrue(false);
			log.info("required details are passed and mobile number is verified & it didn't match with standards and submitted");
		}
				
		
		WebElement mon=driver.findElement(sign.month);	
		Select mont=new Select(mon);
		mont.selectByVisibleText(month);
		
		driver.findElement(sign.day).sendKeys(day);		
		driver.findElement(sign.year).sendKeys(year);	
		driver.findElement(sign.gender).sendKeys(gender);
		driver.findElement(sign.submit).click();
		log.info("Redirected to captcha page");
	}
	
	@DataProvider
	public Object[][] dataset()
	{
		Object[][] data=new Object[2][10];
		data[0][0]=" ";
		data[0][1]=" ";
		data[0][2]=" ";
		data[0][3]=" ";
		data[0][4]="IN";
		data[0][5]=" ";
		data[0][6]="December";
		data[0][7]=" ";
		data[0][8]=" ";
		data[0][9]=" ";
		
		data[1][0]="firstname";
		data[1][1]="lastname";
		data[1][2]="myfirstmailid";
		data[1][3]="Yahoopassword";
		data[1][4]="IN";
		data[1][5]="1234567890";
		data[1][6]="December";
		data[1][7]="12";
		data[1][8]="1996";
		data[1][9]="Male";
		
		return data;
	}
	
	@Test
	public void terms()
	{
		driver.findElement(sign.terms).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterate=handles.iterator();
		String home=iterate.next();
		String terms=iterate.next();
		driver.switchTo().window(terms);
		String termsTitle=driver.getTitle();
		Assert.assertEquals(termsTitle, "Yahoo Terms of Service | Yahoo");
		
		log.info("terms page is opened and cross-checked with the page title through TestNG's Assert");	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		log.info("TC_1_RegistrationTest Test is finished successfully and browser is closed");
		log.info("TermsPage_TC_2 Test is finished successfully and browser is closed");
	}
}


