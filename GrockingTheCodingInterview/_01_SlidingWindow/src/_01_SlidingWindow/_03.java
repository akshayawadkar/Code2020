package _01_SlidingWindow;

public class _03 {

	// smallest contiguous subarray whose sum is greater than or equal to ‘S’

	public static void main(String[] args) {

		int[] arr = { 2, 1, 5, 2, 3, 2 };
		int k = 7;

		solve(arr, k);

	}

	private static void solve(int[] arr, int k) {

		int sum = 0;
		int min = Integer.MAX_VALUE;

		for (int left = 0, right = 0; right < arr.length; right++) {
			sum += arr[right];

			while (sum >= k) {
				min = Math.min(min, right - left + 1);
				sum -= arr[left];
				left++;
			}
		}

		System.out.println(min);
	}

}

/*
 * The time complexity of the above algorithm will be O(N)O(N). The outer for
 * loop runs for all elements, and the inner while loop processes each element
 * only once; therefore, the time complexity of the algorithm will be
 * O(N+N)O(N+N), which is asymptotically equivalent to O(N)O(N).
 */
