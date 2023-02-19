import org.testng.Assert;
import org.testng.annotations.Test;

public class _7_FileForListeners 
{
	@Test
	public void test1()
	{
		System.out.println("Execution is started and Test 1 is passed");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2 will be failed");
		Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3 is passed and execution is finished");
	}

}
