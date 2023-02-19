
public class ThisKeyword 
{
	int a=1;
	int b=2;
	void meth()
	{
		int a=11;
		System.out.println("Local variable:a="+a);
		System.out.println("Instance variable:a="+this.a);
		System.out.println("Instance variable:b="+b);
		
	}
	public static void main(String args[])
	{
		ThisKeyword obj=new ThisKeyword();
		obj.meth();
	}

}
