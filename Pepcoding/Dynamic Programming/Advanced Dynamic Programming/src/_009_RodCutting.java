import java.util.Arrays;

public class _009_RodCutting {

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
		int n = arr.length;
		int[] dp = new int[n];
		System.out.println(Arrays.toString(arr));
		dp[0] = 0;

		for (int i = 1; i < n; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j <= i; j++) {
				max = Math.max(max, arr[j] + dp[i - j]);
			}
			dp[i] = max;
		}

		System.out.println(Arrays.toString(dp));
		return 0;
	}

}
