package Govind_Maddala.SeleniumWithJava;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//div[@class='sc-fotOHu hmnmkS']/div[3]")).click();
		//month:
		int monthsize= driver.findElements(By.cssSelector("[class='DayPicker-Month'] div[class='DayPicker-Caption']")).size(); //2
		for(int i=1;i<=monthsize;i++)
		{
			String month=driver.findElements(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']")).get(i).getText();
			if(month.contains("April"))
			{
				WebElement monthName=driver.findElements(By.xpath("//div[@class='sc-lbhJGD bHgpcs']/div/div/div[2]")).get(i);
				
			}
		}
		
		
		
		
		
		
		
		////div[@class='sc-lbhJGD bHgpcs']/div/div/div[2]/div[i]/div[3]/div/div  {i==1 or 2}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int monthsize1= driver.findElements(By.cssSelector("[class='DayPicker-Month'] div[class='DayPicker-Caption']")).size();
		for(int i=1;i<=monthsize1;i++)
		{
			String month= driver.findElements(By.cssSelector("[class='DayPicker-Month'] div[class='DayPicker-Caption']")).get(i).getText();
			if(month.contains("April"))
			{
				driver.findElements(By.cssSelector("[class='DayPicker-Month'] div[class='DayPicker-Caption']")).get(i);
				int size=driver.findElements(By.cssSelector(".DayPicker-Day")).size();
				System.out.println(size);
				for(int j=0;j<size;j++)
				{
					 String date= driver.findElements(By.cssSelector(".DayPicker-Day")).get(j).getText();
					 if(date.contains("30"))
					 {
						driver.findElements(By.cssSelector(".DayPicker-Day")).get(j).click();
						break;
					 }
				}
				driver.findElement(By.className("fswTrvl__don")).click();
			}
		}
		//day
//		int size=driver.findElements(By.cssSelector(".DayPicker-Day")).size();
//		System.out.println(size);
//		for(int j=0;j<size;j++)
//		{
//			 String date= driver.findElements(By.cssSelector(".DayPicker-Day")).get(j).getText();
//			 if(date.contains("30"))
//			 {
//				driver.findElements(By.cssSelector(".DayPicker-Day")).get(j).click();
//				break;
//			 }
//		}
//		driver.findElement(By.className("fswTrvl__don")).click();
		driver.manage().window().minimize();
		
		//xpath for date= (//div[@class='sc-jJoQJp iPfLQ']/div[@class='sc-bkkeKt gAqCbJ fswFld '])[1]
		//or 			  

	}

}
