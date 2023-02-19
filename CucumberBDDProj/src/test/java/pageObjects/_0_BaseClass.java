package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;

public class _0_BaseClass {
	
	
	
	public String generateRandomEmail() {
		String emailName = RandomStringUtils.randomAlphabetic(5);
		return emailName;
	}
	
	public String browserName() throws IOException {
		FileInputStream fis = new FileInputStream("configure.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		return browserName;
	}
	

}
