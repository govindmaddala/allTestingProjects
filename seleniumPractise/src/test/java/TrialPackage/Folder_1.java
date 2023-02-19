package TrialPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Folder_1 {
	
	String propFilePath = System.getProperty("user.dir")+"//src//test//java//configFiles//data.properties";
	
	
	
	@Parameters({"suitelevelParam"})
	@Test(enabled=true, dataProvider="dataSet")
	public void classA(String dataName) throws IOException {
		FileInputStream fis = new FileInputStream(propFilePath);
		Properties prop = new Properties();
		prop.load(fis);
		prop.setProperty("sname", "maddala");
		FileOutputStream fos = new FileOutputStream(propFilePath);
		prop.save(fos, null);
		System.out.println("Class A from Folder-1");
		System.out.println(prop.get("fname"));
		System.out.println(prop.get("sname"));
		System.out.println(dataName);
	}
	
	
	@DataProvider
	public Object[][] dataSet() {
		Object[][] d = new Object[3][1];
		d[0][0] = "data00";
		d[1][0] = "data10";
		d[2][0] = "data20";
		return d;
	}
}
