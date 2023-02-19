package Govind_Maddala.SeleniumWithJava;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class OpenConnectionMethod {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf = new ChromeDriver();  
		surf.get("https://rahulshettyacademy.com/AutomationPractice/");
//		String url=surf.findElement(By.cssSelector("a[href*='jmeter']")).getAttribute("href") ;
		
		//for active linkqq
		//URLConnection status= new URL(url).openConnection();   or
//		HttpURLConnection status= (HttpURLConnection) new URL(url).openConnection();
//		status.setRequestMethod("HEAD");
//		status.connect();
//		int respCode=status.getResponseCode();
//		System.out.println("JMeter status "+respCode); //JMeter status 200
//		
//		//For broken link
//		String url2=surf.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href") ;
//		//URLConnection status= new URL(url2).openConnection();   or
//		HttpURLConnection status2= (HttpURLConnection) new URL(url2).openConnection();
//		status2.setRequestMethod("HEAD");
//		status2.connect();
//		int respCode2=status2.getResponseCode();
//		System.out.println("Broken link status "+respCode2);  //Broken link status 404
		
		//Checking all links
//		List<WebElement> links= surf.findElements(By.cssSelector("li[class='gf-li'] a"));
//		for(WebElement link : links)
//		{
//			String urls=link.getAttribute("href");
//			HttpURLConnection stat=(HttpURLConnection) new URL(urls).openConnection();
//			stat.setRequestMethod("HEAD");
//			stat.connect();
//			int respcode3=stat.getResponseCode();
//		    Assert.assertTrue(respcode3<400, "Link with text \'"+link.getText()+"\' is broken and its code "+respcode3);
		     
						//or
		
//			if(respcode3>400)
//			{
//				System.out.println("Link with text \'"+link.getText()+"\' is broken and its code "+respcode3); //Link with text 'Broken Link' is broken and its code 404
//				Assert.assertTrue(false);
//			}
//		}
			
		//Soft Assertion to continue program even after breaking in middle
		SoftAssert sa=new SoftAssert();
		List<WebElement> links= surf.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link : links)
		{
			String urls=link.getAttribute("href");
			HttpURLConnection stat=(HttpURLConnection) new URL(urls).openConnection();
			stat.setRequestMethod("HEAD");
			stat.connect();
			int respcode3=stat.getResponseCode();
			System.out.println(respcode3);
		    sa.assertTrue(respcode3<400, "Link with text \'"+link.getText()+"\' is broken and its code "+respcode3);
		    //Link with text 'Broken Link' is broken and its code 404 expected [true] but found [false]
		}
		sa.assertAll();
		
	}

}
