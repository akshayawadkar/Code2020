
public class _0002_ClimbingStairs {

	static Integer[] dp;
	public static void main(String[] args) {
		
		int n = 6;
		dp = new Integer[n + 1];
		int result = solve(n);
		System.out.println(result);
		
	}

	private static int solve(int n) {
		
		if(n < 0) {
			return 0;
		}
		
		if(n == 0 || n == 1) {
			return 1;
		}
		
		if(dp[n] != null) {
			return dp[n];
		}
		
		return dp[n] = solve(n - 1) + solve(n - 2) + solve(n - 3);
	}
}
