package Govind_Maddala.SeleniumWithJava;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf = new ChromeDriver(); 
		surf.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js= (JavascriptExecutor)surf;
		
		//scroll to table
		js.executeScript("window.scroll(0,550)");
		Thread.sleep(3000);
		//scroll over table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=400");
		
		//adding numbers in table 
		List<WebElement> values= surf.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			sum=sum+ Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum); //296
		
		//CrossChecking output
		int Total= Integer.parseInt(surf.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, Total);
		
		//Assignment:
		List<WebElement> prices= surf.findElements(By.cssSelector(".left-align td:nth-child(3)"));
		int grand=0;
		for(int j=0;j<prices.size();j++)
		{
			grand=grand+ Integer.parseInt(prices.get(j).getText());
		}
		System.out.println(grand); //2
		surf.close(); //235
		
	}

}
