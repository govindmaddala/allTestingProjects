package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Navigations {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe"); 
		WebDriver surf = new ChromeDriver();
		
		 //to maximize window
		surf.manage().window().maximize();
		surf.get("https://www.amazon.in/");
		
		//To minimize and maximize window 
		surf.manage().window().minimize();
		surf.manage().window().maximize();
		
		//Here this link will be opened in same window only
		surf.get("https://prsindia.org/");
		
		//To open in new window: 
		surf.navigate().to("https://www.flipkart.com/");
		System.out.println("At instance: "+surf.getTitle());
		
		//backward navigation:
		surf.navigate().back();
		System.out.println("At Backward navigation: "+surf.getTitle());
		
		//forward navigation
		surf.navigate().forward();
		System.out.println("At Forward navigation: "+surf.getTitle());
		surf.quit();
		
/*

At instance: Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!
At Backward navigation: Home | PRSIndia
At Forward navigation: Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!

*/
		
		
	}

}
