package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _18_HandlingFrames {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size()); //to find frame count in main frame
		
		//switching by webelement creating for frame 
		WebElement ele=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(ele); //to switch frame
		
		System.out.println(driver.findElements(By.tagName("iframe")).size()); //to find frame count in a frame
		
		Actions cursor = new Actions(driver); //mouse actions
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement destination= driver.findElement(By.id("droppable"));
		cursor.dragAndDrop(source, destination).build().perform();
		
		//I added other methors irrespective of code:
		
		//by index of a frame
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		
		
		//by 
		driver.switchTo().frame("name of frame");
		
		//to main frame
		driver.switchTo().defaultContent(); //to switch to main frame
		
		
		//switching from child frame to parent child frame (nested frames)
		driver.switchTo().parentFrame();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size()); //to find frame count in main frame

	}

}
