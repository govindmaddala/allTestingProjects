package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class _0_IntroforSelenium 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf = new ChromeDriver();  
		//or ChromeDriver surf = new ChromeDriver();  
		
		surf.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/WebDriver.html");
		System.out.println(surf.getTitle()); //Overview
		System.out.println(surf.getCurrentUrl());
		//https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/WebDriver.html
		surf.close();
	}

}
