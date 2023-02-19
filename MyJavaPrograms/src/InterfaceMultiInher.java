interface Abc
{
	void abc();
}

interface Def
{
	void def();
}

class All implements Abc,Def
{
	public void abc()
	{
		System.out.println("A's Method from All");
	}
	public void def()
	{
		System.out.println("B's Method from All");
	}
}

class Some implements Abc,Def
{
	public void abc()
	{
		System.out.println("A's Method from Some");
	}
	public void def()
	{
		System.out.println("B's Method from Some");
	}
}

public class InterfaceMultiInher {

	public static void main(String[] args) {
		All obj = new All();
		System.out.println("From All:");
		obj.abc(); //A's Method
		obj.def(); //B's Method
		
		Some objs = new Some();
		System.out.println("From Some:");
		objs.abc();
		objs.def();

	}

}
