package Govind_Maddala.SeleniumWithJava;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class proj {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://countyfusion8.kofiletech.us/countyweb/loginDisplay.action?countyname=Arapahoe&errormsg=error.invalid.struts2.token");
		
		Actions mouse=new Actions(driver);
		By ele=By.cssSelector("input[value*='Search Records']");
		mouse.moveToElement(driver.findElement(ele)).click().build().perform();
		
		driver.switchTo().frame("bodyframe");
		
		Thread.sleep(5000);
		WebElement agreeBtn=driver.findElement(By.xpath("//*[@id='accept']"));
		mouse.moveToElement(agreeBtn).click().build().perform();
		
		By main_frame=By.name("bodyframe");
		WebDriverWait pause = new WebDriverWait(driver, Duration.ofSeconds(30));
		pause.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(main_frame));
		String path=System.getProperty("user.dir")+"\\target\\";
		File img=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File(path+"inside.png"));
		
	}

}
