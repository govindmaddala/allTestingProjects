package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15A_Popups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf = new ChromeDriver();
		surf.get("https://rahulshettyacademy.com/AutomationPractice/");
		surf.findElement(By.cssSelector("[placeholder='Enter Your Name']")).sendKeys("govind");
		surf.findElement(By.id("alertbtn")).click();
		System.out.println(surf.switchTo().alert().getText()); // Hello govind, share this practice page and share your
																// knowledge
		surf.switchTo().alert().accept();
		surf.findElement(By.cssSelector("[placeholder='Enter Your Name']")).sendKeys("govind maddala");

		surf.findElement(By.cssSelector("#confirmbtn")).click();
		System.out.println(surf.switchTo().alert().getText()); // Hello govind maddala, Are you sure you want to
																// confirm?
		surf.switchTo().alert().dismiss();
	}

}
