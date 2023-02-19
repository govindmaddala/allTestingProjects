package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _12_CheckboxStatus {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println("Before: "+driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected()); //Before: false
		
		Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected(),false);
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		//driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		//or
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		System.out.println("AFter "+driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected()); //After: true
		
		Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected(),true);
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		driver.close();
	}

}
