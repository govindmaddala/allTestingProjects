package Govind_Maddala.SeleniumWithJava;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11_Checkboxes {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000);
		//To click and check the status of a box
		System.out.println("Initially "+driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[8]/div/div/div[2]/div")).isSelected());
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[8]/div/div/div[2]/div")).click();
		System.out.println("Finally "+driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[8]/div/div/div[1]/svg/circle")).isSelected());
		
		//finding number of boxes on the page and printing the text
		int count=driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).size();
		System.out.println("Number of checkboxes are: "+count);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']"));
		for (WebElement option:list)
		{
			System.out.println(option.getText());
		}	
		
		driver.close();
	}
}

/*
 
 Initiallyfalse
Finallyfalse
Number of checkboxes are: 8
Family & Friends
Senior Citizen
Unaccompanied Minor
Students
Armed Forces
LTC
Govt. Employee
Health Professional
 
 */
 