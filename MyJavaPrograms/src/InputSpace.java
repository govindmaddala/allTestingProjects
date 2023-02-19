import java.util.Scanner;

public class InputSpace {

	public static void main(String[] args) 
	{
		
		String[] name=new String[3]; 
		Scanner reader = new Scanner(System.in).useDelimiter("\n") ;
		System.out.println("Enter the names");
		for (int i=0;i<name.length;i++)
		{
			
			name[i]=reader.next();
		}
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
	}

}
