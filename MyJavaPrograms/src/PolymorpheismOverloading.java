class Maths1
{
	int a,b,c;
	//constructor overloading
	Maths1()  
	{
		a=20;
		b=30;
		c=a+b;
		System.out.println("Default constructor:a+b="+c); //50
	}
	Maths1(int x,int y)
	{
		a=x;
		b=y;
		c=a*b;
		System.out.println("Paramterized constructor:a*b="+c); //50
		//Operator overloading
		System.out.println("Paramterized constructor:a+b="+a+b); //55
		System.out.println("Paramterized constructor:(a+b)="+(a+b)); //10
	}
	
	//Method oveloading
	void add()
	{
		int m,n,o;
		m=111;
		n=222;
		o=m+n;
		System.out.println("Method Overloading:111+222="+o);
	}
	void add(int s,int t)
	{
		int g = s ;
		int h = t ;
		System.out.println("Method Overloading:g/h="+g/h);
	}
}
public class PolymorpheismOverloading 
{

	public static void main(String[] args) 
	{
		Maths1 obj1 = new Maths1();
		Maths1 obj2 = new Maths1(5,5); 
		obj1.add();
		obj2.add();
		obj1.add(27,3);
		obj2.add(100,2);
	} 

}




