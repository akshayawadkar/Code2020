import java.util.*;

public class LCS_5_PrintAllLCS {

	public static void main(String[] args) {

		String x = "ABCBDAB", y = "BDCABA";

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

		List<String> result = printLCS(dp, x, y, m, n);

		System.out.println(result);
		return dp[m][n];
	}

//	[BCBA, BCAB, BDAB]

	private static List<String> printLCS(int[][] dp, String x, String y, int m, int n) {

		if (m == 0 || n == 0) {
			return new ArrayList<>(Arrays.asList(""));
		}

		if (x.charAt(m - 1) == y.charAt(n - 1)) {
			List<String> lcs = printLCS(dp, x, y, m - 1, n - 1);
			for (int i = 0; i < lcs.size(); i++) {
				lcs.set(i, lcs.get(i) + (x.charAt(m - 1)));
			}
			return lcs;
		}

		if (dp[m - 1][n] > dp[m][n - 1]) {
			return printLCS(dp, x, y, m - 1, n);
		}

		if (dp[m - 1][n] < dp[m][n - 1]) {
			return printLCS(dp, x, y, m, n - 1);
		}

		List<String> left = printLCS(dp, x, y, m, n - 1);
		List<String> top = printLCS(dp, x, y, m - 1, n);

		left.addAll(top);

		return left;

	}

}
