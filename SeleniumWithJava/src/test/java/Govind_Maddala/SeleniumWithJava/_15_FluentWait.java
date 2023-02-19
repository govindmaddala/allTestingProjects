package Govind_Maddala.SeleniumWithJava;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.FluentWait;

public class _15_FluentWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 Implicit wait
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
					//below one is deprecated
//		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		
		/*
		 Explicit wait
		 */
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000));
		// for example only
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("hjjhgg")));
		
		
		//driver.get("link");
		//driver.findElement(locator).click(); and waiting takes place
		//System.out.println(driver.findElement(By.className("")).isDisplayed()); //returns false as loading is still going
		//This can be handled by using Fluent Wait
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
		//.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
//
//				WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
//		        {
//				  public WebElement apply(WebDriver driver)  ////Here webelement returns so Webelement is specified in decl.
				  //{ 
//				   if(driver.findElement(locator).isDisplayed)
//					{
//						return driver.findElement(locator); 
//					}
//	    		   else
//                      return null; //this will help in ignoring(NoSuchElementException.class) active until element is visible
//				    }
//				});
//					S.o.p(driver.findElement(locator).isDisplayed)	
	}

}
