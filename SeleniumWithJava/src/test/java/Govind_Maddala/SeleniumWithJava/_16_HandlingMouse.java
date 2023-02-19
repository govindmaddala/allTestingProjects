package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _16_HandlingMouse 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf = new ChromeDriver();
		surf.get("https://www.amazon.in/");
		Actions cursor=new Actions(surf);
		
		//To move Cursor over "Hello, Sign in" button
		WebElement signinbutton=surf.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		//contextClick(): right click 
		cursor.moveToElement(signinbutton).contextClick().build().perform();
	}

}
