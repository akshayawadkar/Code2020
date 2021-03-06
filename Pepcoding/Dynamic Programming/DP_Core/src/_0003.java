import java.util.Arrays;

public class _0003 {

	public static void main(String[] args) {

		int[] values = { 15, 14, 10, 45, 30 };
		int[] weights = { 2, 5, 1, 3, 4 };
		int W = 7;
		int n = values.length;
		int maxProfit = solve(weights, values, W, n);
		System.out.println(maxProfit);

	}

	private static int solve(int[] weights, int[] values, int W, int n) {

		int[][] dp = new int[n + 1][W + 1];

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (weights[i - 1] <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		for (int[] d : dp) {
			System.out.println(Arrays.toString(d));
		}

		return dp[n][W];
	}

}
