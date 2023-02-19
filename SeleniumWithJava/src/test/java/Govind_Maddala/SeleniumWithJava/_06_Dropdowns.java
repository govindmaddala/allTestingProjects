package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _06_Dropdowns 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver browse=new ChromeDriver();
		
		browse.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Selecting static dropdowns: it is done by Select class
		
		WebElement element=browse.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop = new Select(element); //webelement has to be passed
		
		//Selection of dropdownlist can be done by following ways:
		
		//Approach-1) Index
		drop.selectByIndex(1);
		System.out.println("By Index: "+drop.getFirstSelectedOption().getText());
		
		//Approach-2) VisibleText
		drop.selectByVisibleText("USD");
		System.out.println("By VisibleText: "+drop.getFirstSelectedOption().getText());
		
		//Approach-2) Value
		drop.selectByValue("AED");
		System.out.println("By Value: "+drop.getFirstSelectedOption().getText());
		browse.close();
		
		/*

			By Index: INR
			By VisibleText: USD
			By Value: AED
 
		*/	
	}
}
