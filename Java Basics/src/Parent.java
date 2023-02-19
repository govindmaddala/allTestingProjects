import java.util.Arrays;
import java.util.List;

public class Parent {
	
	int parVarA;
	int parVarB;
	String name;
	String na[]=new String[1];
	List<String> li=Arrays.asList(na);
//	String[] nam=new String[20];
//	String var[]= {"hjhjgh"};
//	String[] var1= {"gjgh"};
//	
	
	public Parent(int a,int b) {
		parVarA = a;
		parVarB=b;
		
	}
	
	public void parMeth() {
		int parVarA= 20;
		int parVarB= 20;
		System.out.println("Parent method");
		System.out.println(parVarA);
		System.out.println(parVarB);
		System.out.println(this.parVarA);
		System.out.println(this.parVarB);
		System.out.println(na.length);
		System.out.println("array");
	}
	
	public static void main(String[] args) {
		String names[]= {"govind","maddala","nooks"};
		List<String> nameList=Arrays.asList(names);
		for(String name:names) {
			System.out.println(name);
		}
		
		for(String name:nameList) {
			System.out.println(name);
		}
	}

}
