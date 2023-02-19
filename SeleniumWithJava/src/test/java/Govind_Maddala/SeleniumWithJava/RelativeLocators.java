package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Here many elements are having same attribute but at the same such attribute is only there
		//This can be tackled by using relative locators i.e one unique element is found either at
		 	//'above()' or 'below()' or 'toLeftOf()' or 'toRightOf()'
		
		
		//above
		aboveRelLoc(driver);
		
		//below
		belowRelLoc(driver);
		
		//left
		leftOfRelLoc(driver);
		
		//right
		rightOfRelLoc(driver);
		driver.close();
	}
	public static void aboveRelLoc(WebDriver driver)
	{
		WebElement relLoc=driver.findElement(By.xpath("//input[@name='name']"));
		String text=driver.findElement(with(By.tagName("label")).above(relLoc)).getText();
		System.out.println(text); //Name
	}
	
	
	public static void belowRelLoc(WebDriver driver)
	{
		WebElement dobText=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//below element is 'flex' type it won't be clicked but next below element with tag
		//input will be invoked and here its submit button,so we clicked to make test success 
		driver.findElement(with(By.tagName("input")).below(dobText)).click();
	}
	
	public static void leftOfRelLoc(WebDriver driver)
	{
		WebElement leftop= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		//driver.findElement(By.id("exampleCheck1")).click();  ---> direct by attribute
		
		driver.findElement(with(By.tagName("input")).toLeftOf(leftop)).click(); //---> indirect by rel loc
	}
	
	public static void rightOfRelLoc(WebDriver driver)
	{
		WebElement righttxt=driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(righttxt)).getText()); //Student
	}
}
