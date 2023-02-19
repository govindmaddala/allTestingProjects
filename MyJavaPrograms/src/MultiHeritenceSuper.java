class Aclas
{
	int anum1=2;
	int anum2=4;
	int x=6;
	void aMethod()
	{
		int x=10;
		System.out.println("A's Method");
		System.out.println("A method's x="+x);
		System.out.println("A class's x="+this.x);
	}
}

class Bclas extends Aclas
{
	int bnum1=3;
	int bnum2=6;
	int x=9;
	void bMethod()
	{
		int x=15;
		System.out.println("B's Method");
		System.out.println("B method's x="+x);
		System.out.println("B class's x="+this.x);
		System.out.println("A class's x="+super.x);
	}
}

class Cclas extends Bclas
{
	int cnum1=7;
	int cnum2=14;
	int x=21;
	void cMethod()
	{
		int x=35;
		System.out.println("C's Method");
		System.out.println("C method's x="+x);
		System.out.println("C class's x="+this.x);
		System.out.println("B'class's x="+super.x);
	}
}

public class MultiHeritenceSuper 
{
	public static void main(String args[])
	{
		Bclas objb = new Bclas();
		Cclas objc = new Cclas();
		//accessing B class through C:
		System.out.println("accessing B class through C:");
		objc.bMethod();
		System.out.println("B class variable objc.bnum1="+objc.bnum1);
		System.out.println("B class variable objc.bnum2="+objc.bnum2);	
		System.out.println("B,s not but C's class variable objc.x="+objc.x);
		
		//accessing A class through C:
		System.out.println("accessing A class through C:");
		objc.aMethod();
		System.out.println("A class variable objc.anum1="+objc.anum1);
		System.out.println("A class variable objc.anum2="+objc.anum2);	
		
		//accessing C class through C:
		System.out.println("accessing C class through C:");
		objc.cMethod();
		System.out.println("C class variable objc.cnum1="+objc.cnum1);
		System.out.println("C class variable objc.cnum2="+objc.cnum2);
		System.out.println("C's class variable objc.x="+objc.x);
		
		//accessing A class through B:
		System.out.println("accessing A class through B:");
		objb.aMethod();
		System.out.println("A class variable objb.anum1="+objb.anum1);
		System.out.println("A class variable objb.anum2="+objb.anum2);
	}
}
