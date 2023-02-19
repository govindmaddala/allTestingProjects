
public class Var 
{
	int a=10;          //instance variable:accessed by method only
	static int b=20;   //static variable:can be accessed anywhere
	public static void main(String[] args) 
	{
		int c=30;   //local variable:can be accessed anywhere
		System.out.println(c); //accessing local variable
		System.out.println(b); //accessing static variable
		Var obj = new Var();
		System.out.println(obj.a); //accessing instance variable

	}

}
