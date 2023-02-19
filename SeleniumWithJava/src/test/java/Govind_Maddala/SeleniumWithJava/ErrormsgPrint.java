package Govind_Maddala.SeleniumWithJava;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrormsgPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf=new ChromeDriver(); 
		surf.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		surf.get("https://www.facebook.com/");
		System.out.println(surf.getTitle());
		surf.findElement(By.name("login")).click();
		System.out.println(surf.findElement(By.cssSelector("div._9ay7")).getText());
		//The email address or mobile number you entered isn't connected to an account. Find your account and log in.
		surf.close();		
	}

}
