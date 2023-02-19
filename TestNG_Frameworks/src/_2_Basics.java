import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _2_Basics 
{
	@AfterSuite
	public void testafterSuite1()
	{
		System.out.println("afterSuite1@start from _2_Basics");
	}
	@AfterSuite
	public void testafterSuite2()
	{
		System.out.println("afterSuite2@start from _2_Basics");
	}
	@AfterTest
	public void testafterTrial2()
	{
		System.out.println("AfterTest2@start from _2_Basic");
	}
	
	@BeforeMethod
	public void testbeforeMethod()
	{
		System.out.println("beforeMethod from 2");
	}
	@AfterMethod
	public void testafterMethod()
	{
		System.out.println("afterMethod from 2");
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("testCase3 from 2");
	}
	@Test
	public void testCase4()
	{
		System.out.println("testCase4 from 2");
	}
	@Test
	public void trial2()
	{
		System.out.println("trial2 from _2_Basics");
	}
	@BeforeTest
	public void testbeforeTrial2()
	{
		System.out.println("BeforeTest2@end from _2_Basic");
	}
	
	@BeforeSuite
	public void testbeforeSuite()
	{
		System.out.println("beforeSuite@end from _2_Basics");
	}
	@BeforeClass
	public void testbeforeClass2()
	{
		System.out.println("BeforeClass2@start from _2_Basics");
	}
}
