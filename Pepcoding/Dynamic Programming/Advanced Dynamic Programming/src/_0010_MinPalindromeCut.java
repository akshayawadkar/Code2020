import java.util.Arrays;
import java.util.Stack;

public class _0010_MinPalindromeCut {

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

		int[][] dp2 = new int[n][n];

		for (int dig = 0; dig < dp.length; dig++) {
			for (int i = 0, j = dig; i < dp.length - dig; i++, j++) {
				if (dig == 0) {
					dp2[i][j] = 0;
				} else if (dig == 1) {
					dp2[i][j] = ip.charAt(i) == ip.charAt(j) ? 0 : 1;
				} else {
					if (dp[i][j]) {
						dp2[i][j] = 0;
					} else {
						int min = Integer.MAX_VALUE;
						for (int k = i; k < j; k++) {
							int left = dp2[i][k];
							int right = dp2[k + 1][j];
							min = Math.min(min, left + right + 1);
						}

						dp2[i][j] = min;
					}
				}
			}
		}

		for (int[] d : dp2) {
			System.out.println(Arrays.toString(d));
		}

		return dp2[0][dp.length - 1];
	}
}
