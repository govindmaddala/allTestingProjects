import org.testng.annotations.Test;

public class _5_helpers 
{
	//dependsOnMethods
	@Test
	public void z()
	{
		System.out.print("z ");
	}
	@Test
	public void i()
	{
		System.out.print("i ");
	}
	@Test
	public void j()
	{
		System.out.print("j ");
	}
	@Test(dependsOnMethods={"z","i"})
	public void e()
	{
		System.out.print("e ");
	}
	@Test(timeOut=4000)
	public void b()
	{
		System.out.print("b ");
	}
	@Test(enabled=true)
	public void a()
	{
		System.out.print("a ");
	}
	
	/*
	 normal output with no helpers
	 o/p: a e i z
	 1)dependsOnMethods: e dependsOnMethods={"z","i"}
	 o/p: i j z a b e
	 
	 2)enables= ___ @'a' and continuing with dependency
	 o/p: i j z b e    for false
	      i j z a b e  for true
	      
	 3)timeOut(mSec)
	 */
	
	
}
