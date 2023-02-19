 import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class _10_JSErrorsCap {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CG-DTE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		driver.findElement(By.linkText("Cart")).click();
		driver.findElement(By.id("exampleInputEmail1")).clear();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");
		
		LogEntries logEntries=driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logs=logEntries.getAll();
		for (LogEntry e : logs)
		{
			System.out.println(e.getMessage());
			/*
			 
			 https://rahulshettyacademy.com/angularAppdemo/main.954e66096a8c863a96f6.js 0:34269 "ERROR" "Parameter is not a number!"
			 
			 */
		}
	}
}