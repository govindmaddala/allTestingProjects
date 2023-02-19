public class BinarySearch {

	public static void main(String[] args) {
		
		int[] nums = {0,1,2,3,4,5,6};
		int check = 6;
		int size = nums.length;
		int low = 0; 
		int high = size;
		while(low<=high) {
			int mid = (low + high)/2;
			if(check == nums[mid]) {
				System.out.println("number found");
				break;
			}
			else if(check<nums[mid]) {
				high = mid-1;
			}
			else if(check > nums[mid]) {
				low = mid +1;
			}
		}
	}

}
