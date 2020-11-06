import java.util.Arrays;

public class _03 {

	public static void main(String[] args) {

		int[] arr = { 3, 3, 0, 2, 2, 3 };

		int result = solve2(arr);
		System.out.println(result);

	}

	private static int solve2(int[] arr) {

		int n = arr.length;
		int[] dp = new int[n + 1];
		dp[n] = 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 1; j <= arr[i] && i + j <= n; j++) {
				dp[i] = dp[i] + dp[i + j];
			}
		}
		System.out.println(Arrays.toString(dp));

		return 0;
	}

	private static int solve(int[] arr, int idx) {

		if (idx > arr.length) {
			return 0;
		}

		if (idx == arr.length) {
			return 1;
		}

		int numWays = 0;

		for (int i = 1; i <= arr[idx]; i++) {
			numWays += solve(arr, idx + i);
		}
		return numWays;
	}

}
