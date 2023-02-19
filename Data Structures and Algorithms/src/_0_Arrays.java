
public class _0_Arrays {

	public static void main(String[] args) {
		int num[] = { 90, 11, 2, 3, 4, 5 };

		int small = num[0];
		int large = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < small) {
				small = num[i];
			}
			if (num[i] > large) {
				large = num[i];
			}
		}
		System.out.println("Smallest is " + small);
		System.out.println("largest is " + large);
	}

}
