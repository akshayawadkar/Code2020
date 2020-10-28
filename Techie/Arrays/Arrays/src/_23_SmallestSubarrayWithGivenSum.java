import com.util.Subarray;

public class _23_SmallestSubarrayWithGivenSum {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 21;

		solve(arr, k);

	}

	private static void solve(int[] arr, int k) {

		int left = 0, right = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		Subarray result = new Subarray(-1, -1);

		while (right < arr.length) {
			sum += arr[right];

			while (sum > k) {

				sum -= arr[left];
				left++;
			}

			if (sum == k) {

				if (right - left + 1 < min) {
					min = right - left + 1;
					result.x = left;
					result.y = right;
				}

			}

			right++;
		}
		System.out.println(result);
		System.out.println(min);

	}

}
