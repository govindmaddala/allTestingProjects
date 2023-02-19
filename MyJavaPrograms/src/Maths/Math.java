package Maths;

public class Math 
{
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(""+a+"+"+b+""+"="+c);
	}
	public void subtract(int a, int b)
	{
		int d=a-b;
		System.out.println(a+"-"+b+"="+d);
	}
	public void product(int a, int b)
	{
		int m=a*b;
		System.out.println(a+"*"+b+"="+m);
	}
	public void factorial(int n)
	{
		int f = 1;
		for(int i=n;i>=1;i--)
		{
			if(n<=0)
			{
				System.out.println("Negative numbers are not allowed but 0!=1");
			}
			else
			{
				f*=i;
			}
		}
		System.out.println("Factorial of "+n+" is "+f);
	}
	public void division(int a, int b)
	{
		int by=a/b;
		System.out.println(a+"/"+b+"="+by);
	}
}
