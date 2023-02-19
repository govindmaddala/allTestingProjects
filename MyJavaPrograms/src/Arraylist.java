import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) 
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("maddala");
		name.add("veera");
		name.add("nooka");
		name.add("govindha");
		name.add("govind");			
		name.remove("govindha"); //removes that value
		name.get(3); //fetches that value @ 3 index
		
		
	}

}
