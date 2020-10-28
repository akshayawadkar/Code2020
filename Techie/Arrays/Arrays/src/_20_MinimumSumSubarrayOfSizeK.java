import com.util.Subarray;

public class _20_MinimumSumSubarrayOfSizeK {

	public static void main(String[] args) {

		int arr[] = { 10, 4, 2, 5, 6, 3, 8, 1 };
		int k = 3;

		int minSum = solve(arr, k);
		System.out.println(minSum);

	}

	private static int solve(int[] arr, int k) {

		int left = 0, right = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		Subarray result = new Subarray(-1, -1);
		while (right < arr.length) {
			sum += arr[right];

			if (right - left + 1 > k) {
				sum -= arr[left];
				left++;
			}

			if (right - left + 1 == k) {

				if (sum < min) {
					min = sum;
					result.x = left;
					result.y = right;
				}

			}

			right++;
		}
		System.out.println(result);
		return min;
	}

}
