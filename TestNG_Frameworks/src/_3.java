import org.testng.annotations.Test;

public class _3 
{
	@Test(groups=("smoke"))
	public void U3()
	{
		System.out.println("U3(smoke)--test");
	}
	@Test(groups=("reg"))
	public void O3()
	{
		System.out.println("O3(reg)--test");
	}
	@Test(groups=("smoke"))
	public void I3()
	{
		System.out.println("I3(smoke)--test");
	}
	@Test
	public void E3()
	{
		System.out.println("E3--test");
	}
	@Test(groups={"smoke","reg"})
	public void A3()
	{
		System.out.println("A3(smoke)--test");
	}
}
