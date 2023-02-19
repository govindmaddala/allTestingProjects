package Govind_Maddala.SeleniumWithJava;
import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLExpire {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true); //accepts insecure webpages to open
		
		options.addEncodedExtensions("C:\\Users\\CG-DTE\\Downloads"); //adds extension file to the chrome browser opened
		
		//for proxy for a website
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddresss:1024");
		options.setCapability("proxy", proxy);
		
		//blocking pop-ups
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		//There is option for changing dowload path directory in ChromeOptions and check official page to get code		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.print(driver.getTitle()); 
		//without options: Privacy error
		//with options: expired.badssl.com

	}

}
