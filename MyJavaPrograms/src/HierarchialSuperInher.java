class AClass
{
	int anum1=2;
	int anum2=6;
	int x=18;
	void aMethod()
	{
		int x=54;
		System.out.println("A's Method");
		System.out.println("A method's x="+x);
		System.out.println("A class's x="+this.x);
	}
}
class BClass extends AClass
{
	int bnum1=3;
	int bnum2=9;
	int x=27;
	void bMethod()
	{
		int x=81;
		System.out.println("B's Method");
		System.out.println("B method's x="+x);
		System.out.println("B class's x="+this.x);
		System.out.println("A class's x="+super.x);
	}
}
class CClass extends AClass
{
	int cnum1=7;
	int cnum2=21;
	int x=63;
	void cMethod()
	{
		int x=189;
		System.out.println("C's Method");
		System.out.println("C method's x="+x);
		System.out.println("C class's x="+this.x);
		System.out.println("A class's x="+super.x);
	}
}
public class HierarchialSuperInher {

	public static void main(String[] args) 
	{
		BClass objb = new BClass();
		CClass objc = new CClass();
		
		//accessing A by B:
		System.out.println("accessing A by B:");
		objb.aMethod();
		System.out.println(objb.anum1);
		System.out.println(objb.anum2);
		
		//accessing B by B:
		System.out.println("accessing B by B:");
		objb.bMethod();
		System.out.println(objb.bnum1);
		System.out.println(objb.bnum2);
		
		//accessing A by C:
		System.out.println("accessing A by C:");
		objc.aMethod();
		System.out.println(objc.anum1);
		System.out.println(objc.anum2);
		
		//accessing C by C:
		System.out.println("accessing C by C:");
		objc.cMethod();
		System.out.println(objc.cnum1);
		System.out.println(objc.cnum2);
	}

}
