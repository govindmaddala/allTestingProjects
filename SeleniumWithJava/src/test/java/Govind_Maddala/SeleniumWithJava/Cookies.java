
package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf = new ChromeDriver();  
		surf.manage().addCookie(null); //add cookie by name
		surf.manage().deleteAllCookies(); //delete all cookies
		surf.manage().deleteCookieNamed("cookie name" );
		    //A cookie with specific name can be deleted
			//If a cookie with 'sessionkey' is deleted then logout from page can be done and page returns to home page  

	}

}
