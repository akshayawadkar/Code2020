import java.util.Arrays;

public class LPS_3_PrintLPS {
	public static void main(String[] args) {

		String x = "ABBDCACB";
		String y = new StringBuilder(x).reverse().toString();
		int result = solve(x, y, x.length(), y.length());

		System.out.println(result);

	}

	private static int solve(String x, String y, int m, int n) {

		int[][] dp = new int[m + 1][n + 1];

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (x.charAt(i - 1) == y.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		for (int[] d : dp) {
			System.out.println(Arrays.toString(d));
		}

		String LPS = helper(x, y, dp, m, n);
		System.out.println(LPS);
		return dp[m][n];
	}

	private static String helper(String x, String y, int[][] dp, int m, int n) {

		if (m == 0 || n == 0) {
			return "";
		}

		if (x.charAt(m - 1) == y.charAt(n - 1)) {
			return helper(x, y, dp, m - 1, n - 1) + x.charAt(m - 1);
		}

		if (dp[m - 1][n] > dp[m][n - 1]) {
			return helper(x, y, dp, m - 1, n);
		} else {
			return helper(x, y, dp, m, n - 1);
		}

	}
}
