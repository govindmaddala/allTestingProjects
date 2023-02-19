package Govind_Maddala.SeleniumWithJava;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17_HandlingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf = new ChromeDriver();
		surf.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		surf.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = surf.getWindowHandles();
		Iterator<String> ids = window.iterator();
		String window1 = ids.next();
		String window2 = ids.next();
		surf.switchTo().window(window2);
		String text = surf.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(text);
//		//Please email us at mentor@rahulshettyacademy.com with below template to receive response
		String[] listArr = text.split(" ");
//		
		System.out.println(listArr[4]); // mentor@rahulshettyacademy.com
		String[] mail = listArr[4].split("@");

		System.out.println(mail[1]); // rahulshettyacademy.com
		String[] user = mail[1].split(".com");
		String username = user[0];
		System.out.println(username); // rahulshettyacademy or simply in one step (done by watch option during debug)
		// String username=
		// surf.findElement(By.cssSelector(".im-para.red")).getText().split("
		// ")[4].split("@")[1].split(".com")[0];

		surf.switchTo().window(window1);
		String pass = surf.findElement(By.cssSelector(".text-center.text-white")).getText();
		System.out.println(pass); // (username is rahulshettyacademy and Password is learning)
		String password = pass.split(" ")[6].split(")")[0];
		surf.findElement(By.id("username")).sendKeys(username);
		surf.findElement(By.id("password")).sendKeys(password);
		System.out.println(surf.getTitle());
		surf.quit();
	}

}
