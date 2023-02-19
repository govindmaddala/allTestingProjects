import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _6_a_parameterizing 
{
	@Parameters({"Suite"})
	@Test
	public void suite6a(String parameter)
	{
		System.out.println(parameter+" 6a");
	}
	
	@Parameters({"ab","ba","num"})
	@Test
	public void test6a(String ab,String ba,String num)
	{
		System.out.println(ab+" 6a");
		System.out.println(ba+" 6a");
		System.out.println(num+" 6a");
	}
}
