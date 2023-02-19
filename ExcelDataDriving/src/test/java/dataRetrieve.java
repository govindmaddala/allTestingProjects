import java.io.IOException;
import java.util.ArrayList;

public class dataRetrieve 
{
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