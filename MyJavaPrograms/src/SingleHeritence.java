class A
{
	int a=20;
	int b=30;
	int x=400;
	void aMethod()
	{
		int x=200;
		System.out.println("A's Method");
		System.out.println("A method's x="+x);
		System.out.println("A class's x="+this.x);
	}
}
class B extends A
{
	int c=40;
	int d=60;
	int x=500;
	void bMethod()
	{
		int x=250;
		System.out.println("B's Method");
		System.out.println("B method's x="+x);
		System.out.println("B class's x="+this.x);
		System.out.println("A method or class's? x="+super.x);
	}
}



public class SingleHeritence 
{

	public static void main(String[] args) 
	{
		B obj=new B();
		obj.bMethod();
		System.out.println(obj.c);
		System.out.println(obj.d);
		obj.aMethod();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
