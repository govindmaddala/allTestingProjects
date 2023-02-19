
import org.testng.annotations.Test;

public class _4 
{
	
	@Test(groups=("reg"))
	public void u4()
	{
		
			System.out.println("u4(reg)--test");
	}
	@Test(groups=("reg"))
	public void o4()
	{
		System.out.println("o4(reg)--test");
	}
	@Test
	public void i4()
	{
		System.out.println("i4--test");
	}
	@Test(groups=("smoke"))
	public void e4()
	{
		System.out.println("e4(smoke)--test");
	}
	@Test
	public void a4()
	{
		System.out.println("a4--test");
	}	
}
