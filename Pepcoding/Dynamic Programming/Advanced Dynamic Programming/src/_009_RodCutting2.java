import java.util.Arrays;

public class _009_RodCutting2 {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 9, 10, 17, 17, 20 };

		int n = arr.length;

		int[] newArr = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			newArr[i] = arr[i - 1];
		}

		int result = solve3(newArr);
		System.out.println(result);
	}

	private static int solve3(int[] arr) {

		System.out.println(Arrays.toString(arr));
		int n = arr.length;
		int[] dp = new int[n];

		dp[0] = 0;
		dp[1] = arr[1];

		for (int i = 2; i < n; i++) {

			 int left = 1;
			int right = i - 1;

			int max = arr[i];
			while (left <= right) {
				max = Math.max(max, dp[left] + dp[right]);
				left++;
				right--;
			}
			dp[i] = max;

		}

		System.out.println(Arrays.toString(dp));
		return dp[n - 1];
	}

}
