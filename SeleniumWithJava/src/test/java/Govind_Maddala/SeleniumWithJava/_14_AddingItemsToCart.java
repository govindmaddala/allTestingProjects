package Govind_Maddala.SeleniumWithJava;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14_AddingItemsToCart 
{
	public static void main(String[] args) 
	{
		//Taking grocery list
		int j=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter numner of items,i.e.,n= ");
		int n=scan.nextInt();
		String[] list = new String[n];
		System.out.println("Enter the vegetables(First letter should be capital and spelling must be correct:");
		for (j = 0; j < list.length; j++) 
		{
			//Scanner reader = new Scanner(System.in).useDelimiter("\n");
			Scanner reader = new Scanner(System.in);
			list[j] = reader.next();			
		}
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		//Product list is stored as Weblist
		List<WebElement> veggielist = driver.findElements(By.cssSelector(".product-name"));
		
		//Array of list is converted to Arraylist since it makes process easier and consists 'contains' option to compare
		List<String> veggie=Arrays.asList(list);
		
		//for using break
		//int k=0;
		for (int i = 0; i<veggielist.size(); i++) 
		{
			String[] veg= veggielist.get(i).getText().split("-"); //eg:Text like Brocolli - 1 Kg...extracted and splitted
			if(veggie.contains(veg[0].trim()))  //eg:Brocolli  is trimmed with spaces 
			{
				//k++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();	
				//Since on clicking ADD TO CART is changed to 'ADDED' and its taking time to restore. In this case Parent-child 
				//traversing is used
				System.out.println(veg[0].trim()+" is available and ordered "+veg[1].trim());
				if(j==list.length)  //or if(j==k) 
				{
					break;
				}		
			}
		}
		driver.manage().window().minimize();
	}
}



/*


 
 */

