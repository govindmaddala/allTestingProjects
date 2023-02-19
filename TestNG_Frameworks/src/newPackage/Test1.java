package newPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void abc()
	{
		System.out.println("abc");
	}
	@Test
	public void bcd()
	{
		System.out.println("bcd");
	}
	@Test
	public void cde()
	{
		System.out.println("cde");
	}
	@Test
	public void def()
	{
		System.out.println("def");
	}
	@Test
	public void efg()
	{
		System.out.println("efg");
	}
	@BeforeTest
	public void prev()
	{
		System.out.println("previous");
	}
	@AfterTest
	public void later()
	{
		System.out.println("Later");
	}
	
	@BeforeMethod
	public void meth()
	{
		System.out.println("Method");
	}
}
