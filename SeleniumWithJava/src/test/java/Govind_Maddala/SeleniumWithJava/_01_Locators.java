package Govind_Maddala.SeleniumWithJava;
//Some items were removed from page
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class _01_Locators 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver browse=new ChromeDriver();
		browse.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		browse.get("https://www.amazon.in/");
		System.out.println(browse.getTitle());
		//Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in

		//ID
		//browse.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones");
		
		//name
		//browse.findElement(By.name("field-keywords")).sendKeys("Mobiles") ;
		
		//CSS
		browse.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Mobiles");
		browse.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(browse.getTitle());
		//Amazon.in : Mobile Phones
		
		//Xpath and Printing error message
		browse.findElement(By.cssSelector("input#twotabsearchtextbox")).clear();
		browse.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("ddddddddddddggggg");
		browse.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(browse.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/div/div/div[2]/span")).getText());
		//Try checking your spelling or use more general terms
		
		//Link Text
		browse.findElement(By.linkText("Fashion")).click();
		System.out.println(browse.getTitle());
		//Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids
		
		//Partial Link Text
		browse.findElement(By.partialLinkText("Mob") ).click();
		System.out.println(browse.getTitle());
		//Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in

		
		browse.close();
	} 

}
