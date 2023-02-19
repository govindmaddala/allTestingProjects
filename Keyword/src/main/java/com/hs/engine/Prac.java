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

public class Prac extends Base{
	
	public static WebDriver driver;
	public static Properties properties = intiProperties();
	
	public static Workbook workbook;
	public static Sheet sheet;
	
	private static String spreadSheetPath = System.getProperty("user.dir")+"\\src\\main\\java\\com\\hs\\scenarios\\Login.xlsx";
	
	public static void switchCaseForActionForGivenLocType(String action, WebElement element, String value,WebDriver driver) throws InterruptedException {
		switch (action) {
		case "sendkeys":
			element.clear();
			element.sendKeys(value);
			break;
		case "click":
			element.click();
			Thread.sleep(3000);
			break;
		default:
			break;
		}
	}
	
	public static String Login(String sheetName) throws InterruptedException {
		
		WebElement element;
		
		String locatorType;
		String locatorValue;
		String pageTitle = null;
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(spreadSheetPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			workbook = WorkbookFactory.create(fileInputStream);
			sheet = workbook.getSheet(sheetName);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sheet.getLastRowNum());
		
		for(int i=1; i<=sheet.getLastRowNum();i++) {
			
			String testStep = sheet.getRow(i).getCell(0).toString().trim();
			if(testStep.length() == 0) {
				break;
			}else {
				
				String locatorFromSheet = sheet.getRow(i).getCell(1).toString().trim();
				if(!locatorFromSheet.equalsIgnoreCase("NA")) {
					locatorType = locatorFromSheet;
					locatorValue = sheet.getRow(i).getCell(2).toString().trim();
					
				}else {
					locatorType = "NA";
					locatorValue = "NA";
				}
				
				String action = sheet.getRow(i).getCell(3).toString().trim();
				String value = sheet.getRow(i).getCell(4).toString().trim();
				//For locator = NA
				switch (action) {
				case "open browser":
					driver = initDriver(value);
					break;
				case "enter url":
					driver.get(value);
					break;
				case "pagetitle":
					pageTitle = driver.getTitle();
					System.out.println(pageTitle);
					break;
				case "quit":
					driver.quit();
					break;
				case "close":
					driver.close();
					break;
				default:
					break;
				}
				
				//For locator != NA
				
				
				
				switch (locatorType) {
				case "id":
					element = driver.findElement(By.id(locatorValue));
					switchCaseForActionForGivenLocType(action,element,value,driver);
					break;
					
				case "name":
					element = driver.findElement(By.name(locatorValue));
					switchCaseForActionForGivenLocType(action,element,value,driver);
					break;
				case "css":
					element = driver.findElement(By.cssSelector(locatorValue));
					switchCaseForActionForGivenLocType(action,element,value,driver);
					break;
				case "xpath":
					element = driver.findElement(By.xpath(locatorValue));
					switchCaseForActionForGivenLocType(action,element,value,driver);
					break;
				default:
					break;
				}
			}	
		}
		
		return pageTitle;
		
	}

}
