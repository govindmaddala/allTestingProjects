
public class StringFormat {
	public static void main(String[] args) {
		String firstName = "Govind";
		String lastName = "Maddala";
		
		String fullName = String.format("Full Name: %s %s", firstName,lastName);
		System.out.println(fullName);
		
		Float percentage = 95.5f;
		int ageVal = 26;
		String percent = String.format("Marks percentage: %g", percentage);
//		String Fpercent = String.format("Marks percentage: %g", percentage);
		String age = String.format("Age: %d", ageVal);
		System.out.println(percent);
		System.out.println(age);
		char name[] = {'g','o'};
		String verb = new String(name);
		System.out.println(verb);
	}
}
