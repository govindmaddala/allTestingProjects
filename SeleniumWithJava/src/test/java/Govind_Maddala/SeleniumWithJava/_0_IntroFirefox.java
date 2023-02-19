package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.utility.RandomString;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;



public class _0_IntroFirefox {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CG-DTE\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver surf=new FirefoxDriver();
		
		surf.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/WebDriver.html");
		System.out.println(surf.getTitle()); //Overview
		System.out.println(surf.getCurrentUrl());
		//https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/WebDriver.html
		
		WebElement locElement = surf.findElement(By.id("jgjghj"));
		
		surf.findElement(with(By.tagName("a")).above(locElement));
		String url = locElement.getAttribute("href");		
		
		HttpsURLConnection url1 = (HttpsURLConnection) new URL(url).openConnection();
		url1.setRequestMethod("HEAD");
		url1.connect();
		int respCode = url1.getResponseCode();
		
		surf.close();
	}
}
