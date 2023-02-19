public class BubbleSort {
	public static void main(String[] args) {
		int nums[] = {1,5,4,3,6,7};
		int n = nums.length;
		for (int i = 1; i <n;i++) {
			for(int j=0; j<n-i;j++) {
				int prev = nums[j];
				int nxt = nums[j+1];
				if ( prev> nxt) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for(int num:nums) {
			System.out.print(num);
			System.out.print(" ");
		}
	}

}
