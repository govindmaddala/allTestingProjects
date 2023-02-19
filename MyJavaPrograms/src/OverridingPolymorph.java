class Parent
{
	final void method()
	{
		System.out.println("A's method");
	}
}
class Child extends Parent
{
//	void method()
//	{
//		//super.method();
//		System.out.println("B's method");
//	}
}

public class OverridingPolymorph 
{

	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.method(); 
		//In abscence of "super.method();"
		//B's method
		
		//In presence of "super.method();"
		//A's method
		//B's method
		
		////In presence of final before A's method: B'method will be thrown as error
		//A's method
	}

}
