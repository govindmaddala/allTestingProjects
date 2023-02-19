package com.prac.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	public static Properties properties;
	public static Properties prop = new Properties();
	public static String path = System.getProperty("user.dir")
			+ "//src//main//java//com//prac//base//config.properties";

	public static String driverPath = System.getProperty("user.dir") + "//Drivers";

	public WebDriver sourceDriver() throws IOException {

		properties = new Properties();
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
		String browserName = properties.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath + "//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", driverPath + "//msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;
	}
	
	public static String getScreenshot(WebDriver driver, String className, String methodName) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\reports\\"+className+methodName+".png";
		File img=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File(path));
		return path;
	}
}
