package com.Chailntl.tests;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ChaiIntl.base.BaseClass;
import com.Chailntl.pageobjects.IndexPage;
import com.Chailntl.pageobjects.PaymentDetailsPage;
import com.Chailntl.pageobjects.PaymentPage;


public class PaymentTest extends BaseClass
{
	WebDriver driver;
	public static Logger log=LogManager.getLogger(PaymentTest.class.getName());

	@BeforeTest
	public void beforeTest() throws IOException
	{
		driver=sourceDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("Browser is invoked for Automation of Payment test");
	}
	
	@Test
	public void Paymenttest() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		IndexPage indexpage=new IndexPage();
		indexpage.FullName(driver).sendKeys("dummy");
		indexpage.email(driver).sendKeys("dummy@gmail.com");
		indexpage.phoneNum(driver).sendKeys("14785197");
		log.info("Details are entered");
		PaymentPage paymentpage=indexpage.payBtn(driver);
		log.info("To proceed further Payment button is clicked");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOf(paymentpage.Wallet(driver)));
		
		paymentpage.Wallet(driver).click();
		log.info("Wallet Payment method is selected");
		paymentpage.PayBtn(driver).click();
		PaymentDetailsPage pd=paymentpage.FinalPaymentBtn(driver);
		log.info("Payment button is clicked for final payment");
		wait.until(ExpectedConditions.visibilityOf(pd.OrderDetailElement(driver)));
		log.info("Payment is successfully done");
		String SellerOrderref=pd.SellerOrderref(driver);
		String Orderref=pd.Orderref(driver);
		String AmountPaid=pd.AmountPaid(driver);
		
		FileOutputStream fos=new FileOutputStream(OrderDetails);
		proper.setProperty("Seller-Order-Reference-Number",SellerOrderref);
		proper.setProperty("Order-Reference-Number",Orderref);
		proper.setProperty("Amount_of_money",AmountPaid);
		proper.store(fos, null);
		log.info("All the order details are stored in details.config file");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		log.info("Automation of Payment test is done and browser is closed");
	}
	

}
