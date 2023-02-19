import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _1_Basic 
{
	@BeforeClass
	public void testbeforeClass1()
	{
		System.out.println("BeforeClass1@start from _1_Basic");
	}
	@AfterClass
	public void testafterClass()
	{
		System.out.println("afterClass@start from _1_Basic");
	}
	
	@AfterSuite
	public void testafterSuite()
	{
		System.out.println("afterSuite@start from _1_Basic");
	}
	@AfterTest
	public void testafterTrial1()
	{
		System.out.println("AfterTest1@start from _1_Basic");
	}
	@Test
	public void testCase1()
	{
		System.out.println("testCase1 of 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("testCase2 of 1");
	}
	@Test
	public void testtrial1()
	{
		System.out.println("trial1 from _1_Basic");
	}
	
	@BeforeTest
	public void testbeforeTest1()
	{
		System.out.println("BeforeTest1@end from _1_Basic");
	}
}
