package com.hs.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hs.base.Base;

public class KeywordEngine extends Base {

	public static Workbook workbook;
	public static Sheet sheet;

	public static WebDriver driver;
	public static Properties properties = Base.intiProperties();

	public static String locatorName;
	public static String locatorValue;

	public final static String scenarioSheet = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\hs\\scenarios\\Login.xlsx";

	public static void startExecution(String sheetName) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(scenarioSheet);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetName);
		//Here i = 1 but not 0 because in row=0, there are headings
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			// To terminate the loop when test-steps are empty i.e error happening for
			// getLastRowNum since it is not returning exact row count
			int testStepLength = sheet.getRow(i).getCell(0).toString().length();
			if (testStepLength == 0) {
				break;
			} else {		
				String locatorNameFromExcel = sheet.getRow(i).getCell(1).toString().trim();
				if (!locatorNameFromExcel.equals("NA")) {
					locatorName = sheet.getRow(i).getCell(1).toString().trim();
					locatorValue = sheet.getRow(i).getCell(2).toString().trim();
				} else {
					locatorName = "NA";
					locatorValue = "NA";
				}
				
				String action = sheet.getRow(i).getCell(3).toString().trim();
				String value = sheet.getRow(i).getCell(4).toString().trim();

				switch (action) {
				case "open browser":
					if (value.isEmpty() || value.equals("NA")) {
						driver = Base.initDriver(properties.getProperty("browser"));
					} else {
						driver = Base.initDriver(value);
					}
					break;

				case "enter url":
					if (value.isEmpty() || value.equals("NA")) {
						driver.get(properties.getProperty("url"));
					} else {
						driver.get(value);
					}
					break;

				case "quit":
					driver.quit();
					break;

				default:
					break;
				}

				if (sheet.getRow(i).getCell(0).toString() == null) {
					break;
				}

				WebElement element;
				switch (locatorName) {
				case "id":
					element = driver.findElement(By.id(locatorValue));
					if (action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					} else if (action.equalsIgnoreCase("click"))
						element.click();
					break;
				case "css":
					element = driver.findElement(By.cssSelector(locatorValue));
					if (action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					} else if (action.equalsIgnoreCase("click"))
						element.click();
					break;
				case "NA":
					break;
				default:
					break;
				}
			}

		}
	}

}
