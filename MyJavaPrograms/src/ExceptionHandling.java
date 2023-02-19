class Exceptions
{
	void method()
	{
		try
		{
			int x=5/0;
			System.out.println("Try Closed");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Exception Closed");
		}
		System.out.println("Case Closed");
		
	}
}

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		Exceptions obj=new Exceptions();
		obj.method();
	}

}
