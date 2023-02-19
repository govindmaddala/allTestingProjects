import java.util.Scanner;
public class StrOps 
{

	public static void main(String[] args) 
	{
		//declaration of variables from user
		//Scanner str=new Scanner(System.in);
		//System.out.println("Enter Surname");
		//String sur=str.next();
		String name="Govind";
				//or
		//String name=new String("Govind");
		//System.out.println(sur);
		System.out.println(name);
		
		//operations
		//1) length of string :
		System.out.println("length: "+name.length());
		
		//2) Index of a letter in a word: 
		System.out.println(name.indexOf("d"));
		
		//3)Letter of a word @index:
		System.out.println(name.charAt(5));
		
		//4)Replace one string with another
		System.out.println(name.replace("i", "I"));
		
		//5)Changing to lower cases
		System.out.println(name.toLowerCase());
		
		//6)Changing to upper cases
		System.out.println(name.toUpperCase());
		
		//7)Trimming spaces at starting and ending but not at mid
		System.out.println(name.trim());
		
		//8)Comparing with another string
		System.out.println(name.compareTo("Govind")); //same:0
		System.out.println(name.compareTo("Govin"));  //1
		System.out.println(name.compareTo("G"));      //5
		System.out.println(name.compareTo("F"));	  //-1
		System.out.println(name.compareTo("Govinc")); //-1
		
		//9)Concatenation of strings
		System.out.println("Gen. concatenate: "+name.concat(" Maddala"));
		System.out.println("Before concatenate: "+name);
		name=name.concat(" Maddala");
		System.out.println("After concatenate: "+name);		
	}

}
