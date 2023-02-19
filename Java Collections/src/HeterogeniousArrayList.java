import java.util.ArrayList;

public class HeterogeniousArrayList {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		System.out.println(arrayList.size());
		arrayList.add("Govind");
		arrayList.add(1);
		arrayList.add(10.5);
		arrayList.add(true);
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		arrayList.add(0, "Govind maddala");
		System.out.println(arrayList);
		arrayList.set(0, "maddala govind");
		System.out.println(arrayList);
//		arrayList.clear();
		System.out.println(arrayList);
		ArrayList<String> nameStrings = new ArrayList<>();
		nameStrings.add("sita");
		nameStrings.add("rama");
		arrayList.addAll(nameStrings);
		System.out.println(arrayList);
		
	}

}
