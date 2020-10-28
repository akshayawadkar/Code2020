
public class LCS_3 {

	public static void main(String[] args) {

		String x = "XMJYAUZ", y = "MZJAWXU";

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

		return dp[m][n];
	}

}