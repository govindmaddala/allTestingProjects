package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static Properties prop=new Properties();
	public static WebDriver driver;
	public static String driver_path=System.getProperty("user.dir")+"\\Drivers\\";
	
	
	public static WebDriver invokeDriver() throws IOException
	{
		String path_of_prop=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis=new FileInputStream(path_of_prop);
		prop.load(fis);
		
		String browserName=prop.getProperty("browser"); 
		if(browserName.equals("chrome"))
		{
			ChromeOptions op=new ChromeOptions();
			if(browserName.contains("headless")) 
			{
				op.addArguments("headless");
			}
			System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
			driver=new ChromeDriver(op);
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}
}
