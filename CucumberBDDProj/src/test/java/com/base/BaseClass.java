package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	private static WebDriver driver;
	
	public static WebDriver initDriver() throws IOException {
		FileInputStream fis = new FileInputStream("configure.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
			break;
		default:
			driver = null;
			break;
		}
		return driver;
	}

}
