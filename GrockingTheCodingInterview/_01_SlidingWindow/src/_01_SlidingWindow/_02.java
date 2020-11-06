package _01_SlidingWindow;

public class _02 {

	// Max Sum Subarray of size K
	
	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;

		solve(arr, k);
	}

	private static void solve(int[] arr, int k) {
		 
		int sum = 0;
		int max = 0;
		
		
		for(int left = 0, right = 0; right < arr.length; right++) {
			sum += arr[right];
			
			while(right - left + 1 > k) {
				sum -= arr[left];
				left++;
			}
			
			if(right - left + 1 == k) {
				max = Math.max(max, sum);
			}
		}
		
		System.out.println(max);
	}

}
