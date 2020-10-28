
public class LCS_2 {

	static Integer[][] dp;

	public static void main(String[] args) {

		String x = "XMJYAUZ", y = "MZJAWXU";
		dp = new Integer[x.length() + 1][y.length() + 1];
		int result = solve(x, y, x.length(), y.length());
		System.out.println(result);

	}

	private static int solve(String x, String y, int m, int n) {

		if (m == 0 || n == 0) {
			return 0;
		}

		if (x.charAt(m - 1) == y.charAt(n - 1)) {
			return 1 + solve(x, y, m - 1, n - 1);
		}
		
		if(dp[m][n] != null) {
			return dp[m][n];
		}

		return dp[m][n] = Math.max(solve(x, y, m - 1, n), solve(x, y, m, n - 1));
	}

}
