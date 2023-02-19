package com.qa;

import java.util.Properties;

import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;

public class BaseTest {
	
	protected AppiumDriver driver;
	protected Properties properties;
	
	@BeforeTest
	public void beforeTest() {
		
	}

}
