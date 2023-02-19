import java.util.Scanner;

public class Array 
{

	public static void main(String[] args) 
	{
		//Array SYNTAX: data type[] name = new data type[size];
		//Array SYNTAX: data type[] name = {num1,num2 or 'char1','char2'}
		//Integer Approach-1
		int[] num1 =new int[10];
		System.out.println("Enter numbers");
		Scanner read = new Scanner(System.in);
		for (int i = 0;i<num1.length;i++)
		{
			num1[i]=read.nextInt();
		}
		System.out.print("Number1 is: ");
		for (int i = 0;i<num1.length;i++)
		{
			System.out.print(num1[i]);
		}
		System.out.println(" ");
		
		//Interger Approach-2
		System.out.print("Number2 is: ");
		int[] num2 = {1,2,3,4,5,6,7,8,9,0};
		for (int i = 0;i<num2.length;i++)
		{
			System.out.print(num2[i]);
		}
		
		//String Approach-1
		String[] name=new String[6];
		System.out.println(" ");
		System.out.println("Enter chars of name");
		for(int i=0;i<name.length;i++)
		{
			name[i]=read.next();
		}
		System.out.print("Name is: ");
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]);
		}
		
		//String Approach-2
		String[] Sname= {"M","A","D","D","A","L","A"};
		System.out.print(" ");
		for(int i=0;i<Sname.length;i++)
		{
			System.out.print(Sname[i]);
		}	
	}

}
