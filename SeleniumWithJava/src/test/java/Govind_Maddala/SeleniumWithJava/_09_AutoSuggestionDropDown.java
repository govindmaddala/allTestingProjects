package Govind_Maddala.SeleniumWithJava;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_AutoSuggestionDropDown 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("un");
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.cssSelector(".ui-menu-item"));
		//list of items can only be stored as webelements 
		for(WebElement option : list  )
		{
			System.out.println(option.getText());
		}
		for(WebElement option : list  )
		{
			//if(option.getText().equals("Hungary"))
				//or
			if(option.getText().equalsIgnoreCase("Hungary"))
			{
				option.click();
				break;
			}
		}
		//driver.close();

/*
Brunei Darussalam
Burundi
Hungary
Reunion
Tanzania, United Republic of
Tunisia
United Arab Emirates
United Kingdom (UK)
United States (USA)
United States Minor Outlying Islands
Wallis and Futuna Islands		 
*/
	}

}
