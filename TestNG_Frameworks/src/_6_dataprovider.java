import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _6_dataprovider 
{
	@Test(dataProvider="dataSet")
	public void multi(String val1,String val2)
	{
		System.out.println(val1+" "+val2);
	}
	
	@DataProvider
	public Object[][] dataSet()
	{
		Object[][] Data=new Object[3][2];
		Data[0][0]="00";
		Data[0][1]="01";
		Data[1][0]="10";
		Data[1][1]="11";
		Data[2][0]="20";
		Data[2][1]="21";
		return Data;
	}
}
