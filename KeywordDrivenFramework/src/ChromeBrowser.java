import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowser {
	
	public static void chromeDriver() {
		WebDriver chrome_driver = new ChromeDriver();
		chrome_driver.get("https://getbootstrap.com/");
		System.out.println(chrome_driver.getTitle()+" from Chrome");
		chrome_driver.quit();
	}
	
	public static void firefoxDriver() {
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://getbootstrap.com/");
		System.out.println(firefoxDriver.getTitle()+" from Firefox");
		firefoxDriver.quit();
	}
	
	public static void edgeDriver() {
		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://getbootstrap.com/");
		System.out.println(edgeDriver.getTitle()+" from Edge");
		edgeDriver.quit();
	}
	
	public static void IEDriver() {
		WebDriver IEDriver = new InternetExplorerDriver();
		IEDriver.get("https://getbootstrap.com/");
		System.out.println(IEDriver.getTitle()+" from IE");
		IEDriver.quit();
	}

	public static void main(String[] args) {
		
//		ChromeBrowser.chromeDriver();
//		ChromeBrowser.firefoxDriver();
//		ChromeBrowser.edgeDriver();
//		ChromeBrowser.IEDriver();
		
		

	}

}
