import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _6_b_parameterizing 
{
	@Parameters({"Suite"})
	@Test
	public void parameter6b(String parameter )
	{
		System.out.println(parameter+" 6b");
	}
	@Parameters({"ab","ba"})
	@Test
	public void test6a(String ab,String ba)
	{
		System.out.println(ab+" 6b");
		System.out.println(ba+" 6b");
	}
}
