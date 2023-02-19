import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _6_d_parameterizing 
{
	@Parameters({"Suite"})
	@Test
	public void parameter6a(String parameter )
	{
		System.out.println(parameter+" 6d");
	}
	@Parameters({"cd","dc"})
	@Test
	public void test6a(String cd,String dc)
	{
		System.out.println(cd+" 6d");
		System.out.println(dc+" 6d");
	}
}
