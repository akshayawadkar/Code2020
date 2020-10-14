
public class _0002_ClimbingStairs2 {

	public static void main(String[] args) {

		int n = 6;

		int result = solve(n);
		System.out.println(result);

	}

	private static int solve(int n) {

		// Step 1: Define the storage. 
		int[] dp = new int[n + 1];

		// Step 2: Understand the flow;
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;

		// Step 3: Travel and solve.
		for (int i = 3; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}

		return dp[n];
	}
}
