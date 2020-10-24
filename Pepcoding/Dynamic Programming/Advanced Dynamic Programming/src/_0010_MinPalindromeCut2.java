import java.util.Arrays;
import java.util.Stack;

public class _0010_MinPalindromeCut2 {

	public static void main(String[] args) {

		String ip = "abccbc";
		int result = solve(ip);
		System.out.println(result);

	}

	private static int solve(String ip) {

		int n = ip.length();
		boolean[][] dp = new boolean[n][n];
		int cnt = 0;
		for (int dig = 0; dig < n; dig++) {
			for (int i = 0, j = dig; i < dp.length - dig; i++, j++) {

				if (dig == 0) {
					dp[i][j] = true;
				} else if (dig == 1) {
					dp[i][j] = ip.charAt(i) == ip.charAt(j);
				} else {
					dp[i][j] = ip.charAt(i) == ip.charAt(j) && dp[i + 1][j - 1];
				}
				if (dp[i][j]) {
					cnt++;
				}
			}

		}

		int[] dp2 = new int[n];

		for (int i = 1; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = i; j >= 1; j--) {
				if (dp[j][i]) {
					min = Math.min(min, dp2[j - 1]);
				}

			}
			dp2[i] = min + 1;
		}
		System.out.println(Arrays.toString(dp2));

		return 0;
	}
}
