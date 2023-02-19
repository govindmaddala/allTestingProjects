
public class ConstructorClass 
{
	int a;
	String name;
	ConstructorClass()		//default constructor
	{
		System.out.println("This is default constructor");
		a=26;
		name="govind";
	}
	ConstructorClass(int num,String word) //parameterized  constructor
	{
		System.out.println("This is Parameterized constructor");
		a=num;
		name=word;
	}
	public static void main(String[] args) 
	{
		ConstructorClass obj1 = new ConstructorClass();
		System.out.println("Age is "+obj1.a);
		System.out.println("Name is "+obj1.name);
		//Assigning through constructor
		ConstructorClass obj2 = new ConstructorClass(25,"Jai");
		System.out.println("Age is "+obj2.a);
		System.out.println("Name is "+obj2.name);
	}

}
