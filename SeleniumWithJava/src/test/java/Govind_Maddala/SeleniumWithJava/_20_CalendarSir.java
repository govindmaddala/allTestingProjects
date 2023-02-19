package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class _20_CalendarSir 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html#");
		driver.manage().window().maximize();
		calender2(driver);
		//calender(driver);
		//driver.manage().window().minimize(); 
		driver.close();
	}

public static void calender2(WebDriver driver)
{
	//month
	driver.findElement(By.id("second_date_picker")).click();
	
	//month:
	while(!driver.findElement(By.cssSelector(".ui-datepicker-title")).getText().contains("July")) 
	{
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click(); 
		//for positive error, next is clicked until required date comes
	}
	//for date:
	int count=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")).size();
	for(int i=0;i<count;i++)
	{
		String num=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")).get(i).getText();
		if(num.contains("21"))
		{
			driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")).get(i).click();
		}
	}
}
	
	

	
public static void calender(WebDriver driver)
{
	driver.findElement(By.id("fifth_date_picker")).click();
	//month:
	while(!driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]")).getText().contains("April"))
	{
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}
	////////////////           OK         //////////////////
	int size=driver.findElements(By.cssSelector("[data-handler='selectDay']")).size();
	for(int i=0;i<size;i++)
	{
		String date=driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(i).getText();
		if(date.equalsIgnoreCase("4"))
		{
			driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(i).click();
		}
	}
}

}