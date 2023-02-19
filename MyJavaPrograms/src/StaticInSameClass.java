
public class StaticInSameClass 
{
	static int var=10;
	static void method()
	{
		System.out.println("Static Method");
	}
	static
	{
		System.out.println("Static Block");
	}

	public static void main(String[] args) 
	{
		System.out.println(var);
		method();
	}

}
