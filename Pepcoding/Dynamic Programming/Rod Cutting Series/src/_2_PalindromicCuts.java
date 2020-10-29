import java.util.Arrays;
import java.util.Stack;

public class _2_PalindromicCuts {

	public static void main(String[] args) {

		String s = "abccbc";
//		solve(s); 
//		solve2(s);
		solve3(s);

	}

	private static void solve3(String s) {
		int n = s.length();
		boolean[][] dp = new boolean[n][n];
		int cnt = 0;
		for (int dig = 0; dig < n; dig++) {
			for (int i = 0, j = dig; i < n - dig; i++, j++) {

				if (dig == 0) {
					dp[i][j] = true;
				} else if (dig == 1) {
					dp[i][j] = s.charAt(i) == s.charAt(j);
				} else {
					dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
				}
				if (dp[i][j]) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

		int[] dp2 = new int[n];
		dp2[n - 2] = s.charAt(n - 1) == s.charAt(n - 2) ? 0 : 1;

		for (int i = n - 3; i >= 0; i--) {
			int min = Integer.MAX_VALUE;
			for (int j = i; j < n - 1; j++) {
				if(dp[i][j]) {
					min = Math.min(min, dp2[j + 1]);
				}
			}
			dp2[i] = min + 1;
		}
		
		System.out.println(Arrays.toString(dp2));

	}

	private static void solve2(String s) {
		int n = s.length();
		boolean[][] dp = new boolean[n][n];
		int cnt = 0;
		for (int dig = 0; dig < n; dig++) {
			for (int i = 0, j = dig; i < n - dig; i++, j++) {

				if (dig == 0) {
					dp[i][j] = true;
				} else if (dig == 1) {
					dp[i][j] = s.charAt(i) == s.charAt(j);
				} else {
					dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
				}
				if (dp[i][j]) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

		int[] dp2 = new int[n];
		dp2[1] = s.charAt(0) == s.charAt(1) ? 0 : 1;

		for (int j = 2; j < n; j++) {
			int min = Integer.MAX_VALUE;
			for (int i = j; i >= 1; i--) {
				if (dp[i][j]) {
					min = Math.min(min, dp2[i - 1]);
				}
			}
			dp2[j] = min + 1;
		}

		System.out.println(Arrays.toString(dp2));

	}

	private static void solve(String s) {

		int n = s.length();
		boolean[][] dp = new boolean[n][n];
		int cnt = 0;
		for (int dig = 0; dig < n; dig++) {
			for (int i = 0, j = dig; i < n - dig; i++, j++) {

				if (dig == 0) {
					dp[i][j] = true;
				} else if (dig == 1) {
					dp[i][j] = s.charAt(i) == s.charAt(j);
				} else {
					dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
				}
				if (dp[i][j]) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

		int[][] dp2 = new int[n][n];

		for (int dig = 0; dig < n; dig++) {
			for (int i = 0, j = dig; i < n - dig; i++, j++) {

				if (dig == 0) {
					dp2[i][j] = 0;
				} else if (dig == 1) {
					dp2[i][j] = s.charAt(i) == s.charAt(j) ? 0 : 1;
				} else {

					if (dp[i][j]) {
						dp2[i][j] = 0;
					} else {

						int min = Integer.MAX_VALUE;
						for (int k = i; k < j; k++) {
							int a = dp2[i][k];
							int b = dp2[k + 1][j];
							min = Math.min(min, a + b);
						}
						dp2[i][j] = min + 1;
					}
				}

			}

		}

		for (int[] d : dp2) {
			System.out.println(Arrays.toString(d));
		}

	}
}