
public class _01 {

	public static void main(String[] args) {

		int n = 6;
		int result = solve2(n);
		System.out.println(result);
	}

	private static int solve2(int n) {
		
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[n];
	}

	private static int solve(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		return solve(n - 1) + solve(n - 2);
	}

}
