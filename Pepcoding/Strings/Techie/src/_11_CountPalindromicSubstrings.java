
public class _11_CountPalindromicSubstrings {

	public static void main(String[] args) {

		String ip = "google";
		sove(ip);
	}

	private static void sove(String ip) {

		int n = ip.length();
		boolean[][] dp = new boolean[n][n];

		for (int dig = 0; dig < n; dig++) {
			for (int i = 0, j = dig; i < n - dig; i++, j++) {
				if (dig == 0) {
					dp[i][j] = true;
				} else if (dig == 1) {
					dp[i][j] = ip.charAt(i) == ip.charAt(j);
				} else {
					dp[i][j] = ip.charAt(i) == ip.charAt(j) && dp[i + 1][j - 1];
				}
				if (dp[i][j]) {
					System.out.println(ip.substring(i, j + 1));
				}
			}
		}

	}
}
