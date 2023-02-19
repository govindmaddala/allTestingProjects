package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08_DynamicDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//flight booking approach(1) -----> Using Index
		/*
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //to click depart button and no need for clicking arrival since it is automatic
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		driver.findElement(By.xpath("(//a[@value='VTZ'])[2]")).click();
		
		*/
		
		//flight booking approach(2) -----> Using Parent to child traversing
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BOM']")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"VTZ\"]")).click();
		driver.close();
	}
}
