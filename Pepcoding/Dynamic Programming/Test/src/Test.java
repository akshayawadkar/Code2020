import java.util.Arrays;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int mcm = solve(arr);
		System.out.println(mcm);
	}

	private static int solve(int[] arr) {

		int n = arr.length;

		int[][] dp = new int[n - 1][n - 1];

		for (int dig = 0; dig < dp.length; dig++) {
			for (int i = 0, j = dig; i < dp.length - dig; i++, j++) {

				if (dig == 0) {
					dp[i][j] = 0;
				} else if (dig == 1) {
					dp[i][j] = arr[i] * arr[j] * arr[j + 1];
				} else {
					int min = Integer.MAX_VALUE;
					for (int k = i; k < j; k++) {
						int left = dp[i][k];
						int right = dp[k + 1][j];
						int multiCost = arr[i] * arr[k + 1] * arr[j + 1];
						min = Math.min(min, left + right + multiCost);
					}
					dp[i][j] = min;

				}
			}
		}

		return dp[0][dp.length - 1];
	}
}