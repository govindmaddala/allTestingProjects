package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _02_LocatorsAssertion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf=new ChromeDriver();
		surf.get("https://www.amazon.com/");
		System.out.println(surf.getTitle());
		surf.findElement(By.id("twotabsearchtextbox")).sendKeys("ggggggggggggggggg");
		surf.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(surf.getTitle());
		System.out.println(surf.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div[2]/div[1]/h2/a/span")).getText());
		Assert.assertEquals(surf.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div[2]/div[1]/h2/a/span")).getText(),"Echo Dot (3rd Gen, 2018 release) - Smart speaker with Alexa - Charcoal");
		surf.close();
	}
}
