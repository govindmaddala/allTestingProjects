package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _13_HandlingCalender {

	public static void main(String[] args) throws InterruptedException 
	{
		//Today date can be selected by class since it is highlighted and active when compare to others.
		//rest other dates to be selected can be done by using for loop which will be discussed in future lectures
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//isenabled works in some pages and not in other pages and this problem can be tackled by using attributes and values
		//Some buttons are acitve but thier attributes get change like opacity etc. such features have to used 
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); //display: block; opacity: 0.5;
		System.out.println("Before To button: "+driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).isEnabled()); //true
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5"))
		{
			System.out.println("Button is disabled");  //Button is disabled
			Assert.assertTrue(true);
		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //round button clicked
		//from date is selected
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click(); 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); 
		
		//to date is selected 
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); //to
		
		//status is checked
		System.out.println("After To button: "+driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).isEnabled()); //true
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); //display: block; opacity: 1;
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1"))
		{
			System.out.println("Button is enabled");
			Assert.assertTrue(true); //Button is enabled
		}
		driver.close();
	}

}
