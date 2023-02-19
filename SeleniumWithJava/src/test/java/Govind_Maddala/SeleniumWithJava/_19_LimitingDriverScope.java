package Govind_Maddala.SeleniumWithJava;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class _19_LimitingDriverScope 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Total links in whole page are "+driver.findElements(By.tagName("a")).size()); //RIGHT
		
		WebElement footer=driver.findElement(By.id("navFooter"));
		System.out.println("Total links in footer page are "+footer.findElements(By.tagName("a")).size()); //RIGHT
		
		WebElement subfooter1=footer.findElement(By.xpath("//div[@id='navFooter']/div[4]/ul")); //RIGHT
		//WebElement subfooter1=footer.findElement(By.xpath("//div[4]/ul")); //RIGHT
		System.out.println("Total links in subfooter page are "+subfooter1.findElements(By.tagName("a")).size());
		
		
		WebElement footTab=footer.findElement(By.xpath("//div[@id='navFooter']/div[5]/table")); //RIGHT
		//WebElement footTab=footer.findElement(By.xpath("//div[5]/table")); //RIGHT
		System.out.println("Total links in footerTable page are "+footTab.findElements(By.tagName("a")).size());
		int count=footTab.findElements(By.tagName("a")).size();
		for(int i=1;i<count;i++)
		{
			String newWindow= Keys.chord(Keys.CONTROL,Keys.ENTER);
			footTab.findElements(By.tagName("a")).get(i).sendKeys(newWindow);
		}
		Thread.sleep(10000);
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> ids=windows.iterator();
		while(ids.hasNext())
		{
			String tab=ids.next();
			driver.switchTo().window(tab);
			System.out.println(driver.getTitle());
		}
/*
		 
Total links in whole page are 365
Total links in footer page are 55
Total links in subfooter page are 17
Total links in footerTable page are 9
Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
Stream Music on Amazon Prime Music
Download Prime Now App for 2 Hours Delivery of Grocery, Household Supplies, Personal Care & more -Amazon.in
Buy b2b online at best prices in India- amazon.in/business
Shopbop - Top Designer Apparel, Shoes, Accessories & More
IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows
Digital Photography Review
Audible India | Free Audiobook with Trial | Audible.in
What is Cloud Computing
		 
*/

		//WebElement footTabCol=footer.findElement(By.xpath("//div[@id='navFooter']/div[5]/table/tbody/tr[1]/td[1]")); //RIGHT
		WebElement footTabCol=footer.findElement(By.xpath("//div[5]/table/tbody/tr[1]/td[1]")); //RIGHT
		System.out.println("Total links in footerTablerowColumn page are "+footTabCol.findElements(By.tagName("a")).size());
		//driver.close();
	} 

}
