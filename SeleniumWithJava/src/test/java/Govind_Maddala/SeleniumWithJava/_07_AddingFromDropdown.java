package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_AddingFromDropdown {

	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf=new ChromeDriver();
		surf.manage().window().maximize();
		surf.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println("Initial Passengers count: "+surf.findElement(By.id("divpaxinfo")).getText());
		surf.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000);
		
		for(int i=1;i<=3;i++)
		{
			surf.findElement(By.id("hrefIncAdt")).click(); //click 3 more adults
		}
		
		int j=1;
		while(j<=2)
		{
			surf.findElement(By.id("hrefIncChd")).click(); //click 2 childers
			j++;
		}
		
		int k=1;
		do
		{
			surf.findElement(By.id("hrefIncInf")).click(); //click for 1 child
			k++;
		}
		while(k<2);
		
		System.out.println("Final Passengers count: "+surf.findElement(By.id("divpaxinfo")).getText());
		surf.findElement(By.id("btnclosepaxoption")).click();
		surf.close();
/*
Initial Passengers count: 1 Adult
Final Passengers count: 4 Adult, 2 Child, 1 Infant
* */
	}

}
