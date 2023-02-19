package Govind_Maddala.SeleniumWithJava;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf = new ChromeDriver();  
		surf.get("https://commons.apache.org/proper/commons-io/download_io.cgi");
		
		//Syntax for taking screenshot and saving it in local device
		File image=((TakesScreenshot)surf).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(image, new File("D:\\Software\\Java\\SS.png"));

		
	}
}
