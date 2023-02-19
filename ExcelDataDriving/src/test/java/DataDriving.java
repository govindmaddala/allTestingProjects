import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriving 
{
	public ArrayList<String> getData(String sheetName,String colHeading,String rowHeading) throws IOException
	{
		//to store values in an array list
		ArrayList<String> dataValues=new ArrayList<String>();
		
		//to open file
		FileInputStream fis=new FileInputStream("D:\\Software\\Excel\\dataforjava.xlsx");
		
		//to access total excel file
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//get the access to required sheet out of collection of sheets using handling windows type and 
		//iterate to get required sheet (here it is 'Overview')
		int count=workbook.getNumberOfSheets();
		//System.out.println(count); //-----> o/p:4
		for(int i=0;i<count;i++)
		{
			if(workbook.getSheetName(i).contentEquals(sheetName)) //on matching with name it enters if block
			{
				//System.out.println("Overview file exists @ "+i); //Overview file exists @ 2
				
				//get access to that sheet and iterate it to first row
				XSSFSheet reqSheet = workbook.getSheetAt(i);
				Iterator<Row> rows= reqSheet.rowIterator(); 
				Row headingRow=rows.next(); //rowWise iteration and now it is pointing row headings
				
				//now cell iterate to get required heading and here it is 'Test case'
				Iterator<Cell> cells= headingRow.cellIterator();
				int num=0,column=0; //here column is created to find index of required columnHeading
				while(cells.hasNext())
				{
					Cell currentCell=cells.next();
					String value=currentCell.getStringCellValue();
					if(value.equalsIgnoreCase(colHeading))
					{
						column=num;
						//System.out.println("Yes it exists and present @ "+column); @0
					}
					num++;
				}
				
				//Already 'rows' is pointing "rows heading" and 'cells' is pointing "column heading" with name (Test case)
				//Iterate row wise in that column until we get (here it is 'purchase') required data 
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(rowHeading))
					{
						//get the data by iterating cell wise
						Iterator<Cell> c= r.cellIterator();
						c.next(); //now c is at purchase,so to get values it is bypassed and if u want purchase heading also comment this step
						while(c.hasNext())
						{
							//System.out.println(c.next().getStringCellValue()); //but we want all the values in array
							Cell cellValue=c.next();
							if(cellValue.getCellType()==CellType.STRING)
							{
								dataValues.add(cellValue.getStringCellValue());
							}
							else
							{
								dataValues.add(NumberToTextConverter.toText(cellValue.getNumericCellValue()));
							}
						}
					}
				}		
			}
			workbook.close();
		}
		return dataValues;
	}
	public static void main(String[] args) throws IOException 
	{	
		DataDriving obj=new DataDriving();
		ArrayList<String> data= obj.getData("Overview", "Test case", "purchase");
		System.out.println("Excel with sheetname 'Overview' having rowheading 'Test case' in which columnheading 'purchase' has following data");
		for(String val: data)
		{
			System.out.println(val);
		}
	}
}
