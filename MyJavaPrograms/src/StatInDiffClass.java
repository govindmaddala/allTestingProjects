
public class StatInDiffClass {
	
	public static void main(String[] args) 
	{
		System.out.println("This is outer class");
		System.out.println(Outerclass.outvar);
		Outerclass.outmethod();

	}

}

class Outerclass
{
	static int outvar=20;
	static void outmethod()
	{
		System.out.println("Static Outer Method");
	}
	static
	{
		System.out.println("Static Outer Block");
	}
}
