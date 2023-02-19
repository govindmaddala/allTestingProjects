package Excelhandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Excel {

	public static void main(String[] args) throws IOException {
		
		String excelPath = System.getProperty("user.dir")+"//src//test//java//configFiles//file_example_XLS_5000.xls";
		FileInputStream fis = new FileInputStream(excelPath);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		
		HSSFSheet sheet = wb.getSheetAt(0);
		
//		System.out.println();
		
		Iterator<Row> rowIt = sheet.rowIterator();
		Row fr = rowIt.next();
		Row dr = rowIt.next();
		
		System.out.println(dr.getCell(2));
		
		
//		Iterator<Cell> fc =  dr.cellIterator();
//		while (fc.hasNext()) {
//			Cell val = fc.next();
//			System.out.println(val);
//		}
			
	}

}
