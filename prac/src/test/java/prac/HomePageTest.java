package prac;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.prac.base.Base;
import com.prac.pageobjects.HomePage;

public class HomePageTest extends Base {

	public WebDriver driver;
	HomePage index = new HomePage();

	public static Logger log = LogManager.getLogger(HomePageTest.class.getName());

	@BeforeTest
	public void driverInvoke() throws IOException {
		driver = sourceDriver();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		log.info("test is started");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("website is opened");
	}

	@Test
	public void searchFunction() {
		index.search(driver).sendKeys("mobile");
		log.info("mobile is entered");
		driver.close();
		log.info("website is closed");
		
	}
}
