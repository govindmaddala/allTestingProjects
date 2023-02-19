abstract class P
{
	abstract void aMeth();
}
class Z extends P
{
	void bMeth()
	{
		System.out.println("B's method");
	}
	
	void aMeth()
	{
		System.out.println("A's method");
	}
}
class X extends P
{
	void xMeth()
	{
		System.out.println("x's method");
	}
	
	void aMeth()
	{
		System.out.println("A's method");
	}
}



abstract class E
{
	abstract void eMeth();
}
abstract class F
{
	void eMeth()
	{
		System.out.println("E's method");
	}
	abstract void fMeth();
}
class G extends F
{
	void fMeth()
	{
		System.out.println("F's method");
	}
}





public class AbstractConcrete 
{

	public static void main(String[] args) 
	{
		Z objz = new Z();
		objz.aMeth(); //A's method
		objz.bMeth(); //B's method
		X objx = new X();
		objx.aMeth(); //A's method
		objx.xMeth(); //x's method
		
		
		/////-------------------/////
		System.out.println("G extends F which defines E");
		G objg=new G();
		objg.fMeth();
		objg.eMeth();
		//G extends F which defines E
		//F's method
		//E's method
		
	}

}
