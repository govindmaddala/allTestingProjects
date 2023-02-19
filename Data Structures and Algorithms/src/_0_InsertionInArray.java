
public class _0_InsertionInArray {

	public static void main(String[] args) {
		int num[] = { 1, 2, 4, 5, 6 };

		int pos = 2;
		int val = 3;
		int len = num.length;
		for (int i = len; i >= pos; i--) {
			num[i + 1] = num[i];
		}
		num[pos] = val;
		for (int a : num) {
			System.out.println(a);
		}
	}

}
