package Govind_Maddala.SeleniumWithJava;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Opening new window or tab 
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handleIds= driver.getWindowHandles();
		Iterator<String>id=handleIds.iterator();
		String parent=id.next();
		String child=id.next();
		driver.switchTo().window(child).get("https://www.rahulshettyacademy.com/#/index");
		String ip=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/']")).get(8).getText();
		//Cypress-Modern Automation Testing From Scratch + Framework
		
		WebElement namebox=driver.switchTo().window(parent).findElement(By.cssSelector("[name='name']"));
		
		//Taking screenshot of webelements
		File bef=namebox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bef, new File("_34before.png"));
		namebox.sendKeys(ip);
		File aft=namebox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(aft, new File("_34after.png"));
		
		//Getting dimensions of an webElement (UX umbrella)
		int ht= namebox.getRect().getHeight();
		int wd= namebox.getRect().getWidth();
		System.out.println("Dimensions of box are "+ht+"x"+wd);
		//   Dimensions of box are 38x930
		
		driver.quit();
	}

}
