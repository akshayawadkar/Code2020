
public class _02 {

	public static void main(String[] args) {

		int n = 6;
		int numWays = solve2(n);
		System.out.println(numWays);
	}

	private static int solve2(int n) {

		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		return dp[n];
	}

	private static int solve(int n) {

		if (n < 0) {
			return 0;
		}

		if (n == 0 || n == 1) {
			return 1;
		}

		return solve(n - 1) + solve(n - 2) + solve(n - 3);
	}

}
