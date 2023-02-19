package Govind_Maddala.SeleniumWithJava;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingWebTableStreams {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//sortingWebTable(driver);
		
		//Getting price of a given veggie name:
		//costOfVeggie(driver);
		
		//to sort and find the veggies cost in anypage by clicking next button until we get 
		//reVeggieCost(driver);
		
		//Checking filter by entering a keyword in search and checking the webelements we got
		filterCheckbySearch(driver);
		driver.close();
		
	}
	
	//Sorting web table and conforming using streams 
	public static void sortingWebTable(WebDriver driver)
	{
		//to click sort button
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
				
		//to get all webelements
		List<WebElement> webelementlist= driver.findElements(By.xpath("//tbody/tr/td[1]"));
				
		//get text from list using stream
		List<String> webeleText= webelementlist.stream().map(s->s.getText()).collect(Collectors.toList());
				
		//text is get sorted 
		List<String> sortedwebeleText= webeleText.stream().sorted().collect(Collectors.toList());
				
		//using assertions sorted text is checked with text without sorted
		Assert.assertTrue(webeleText.equals(sortedwebeleText));
	}
	
	
	//Getting price of a veggie
	public static void costOfVeggie(WebDriver driver)
	{
		//to get the list of web elements 
		List<WebElement> webList= driver.findElements(By.xpath("//tbody/tr/td[1] "));
		
		//to get text and filter it by having required veggie using stream
		List<String> price= webList.stream().filter(s->s.getText().contains("Tomato")).map(a->getPrice(a)).collect(Collectors.toList());
		price.forEach(r->System.out.print(r)); //37 
	}
	
	
	private static String getPrice(WebElement a) 
	{
		String rate=a.findElement(By.xpath("following-sibling::td[1]")).getText();
		return rate;
	
	}
	
	
	
	//Sorting,finding elements by clicking next until we get required element
	public static void reVeggieCost(WebDriver driver)
	{
		//To sort
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		//to get elements
		List<String> rates;
		do //first search the present page and click if not present so do-while is used
		{
			//grab the elements
			List<WebElement> list= driver.findElements(By.xpath("//tbody/tr/td[1]"));
			
			//check that elements contains wheat
			rates= list.stream().filter(a->a.getText().contains("Wheat"))
			.map(a->getPrice(a)).collect(Collectors.toList());
			//if not contains click on next
			if(rates.size()<1)
			{
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}while(rates.size()<1);
		//after requiring the element print the output
		rates.forEach(r->System.out.println(r)); //67
		
	}
	
	
	//Checking filter by entering a keyword in search and checking the webelements we got
	public static void filterCheckbySearch(WebDriver driver)
	{
		//enter name we want
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		//grab the list we get
		List<WebElement> list= driver.findElements(By.xpath("//tbody/tr/td[1]"));
		//again filter the list with name we want using stream
		List<WebElement> crosscheckList= list.stream().filter(a->a.getText().contains("Rice")).collect(Collectors.toList());
		
		//Approach-1:checking by size:
		Assert.assertEquals(list.size(), crosscheckList.size());    //SUCCESS
		//if filter is working then both are equal and test will be success
		
		//Approach-2:checking by name if we anticipate the both lists have only one element
		Assert.assertEquals(list.get(0).getText().contentEquals("Rice"),
				crosscheckList.get(0).getText().contentEquals("Rice"));     //SUCCESS
	}
}
