package Selenium.practiseSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AllDriversLaunch {

	public static void main(String[] args) {

		String driversPath = System.getProperty("user.dir") + "\\Drivers";

		// Chrome Driver launch
		System.setProperty("webdriver.chrome.driver", driversPath + "\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		// or ChromeDriver chromeDriver = new ChromeDriver();

		// Firefox driver launch
		 System.setProperty("webdriver.gecko.driver", driversPath + "\\geckodriver.exe");
		 FirefoxOptions options = new FirefoxOptions();
		 options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		 WebDriver firefoxDriver = new FirefoxDriver(options);

		 System.setProperty("webdriver.edge.driver", driversPath + "\\msedgedriver.exe");
		 WebDriver edgeDriver = new EdgeDriver();

		chromeDriver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/WebDriver.html");
		System.out.println(chromeDriver.getTitle());
		System.out.println(chromeDriver.getCurrentUrl());
		chromeDriver.close();

		/*
		 * Overview
		 * https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/
		 * selenium/WebDriver.html
		 * 
		 */

		System.out.println(driversPath);
	}

}
