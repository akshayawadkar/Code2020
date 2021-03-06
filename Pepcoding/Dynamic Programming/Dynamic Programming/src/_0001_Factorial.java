
public class _0001_Factorial {

	static Integer[] dp;
	public static void main(String[] args) {
		
		int n = 10;
		dp = new Integer[n + 1];
		int result = solve(n); //55
		System.out.println(result);
		
		
	}

	private static int solve(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		if(dp[n] != null) {
			return dp[n];
		}
		
		return dp[n] = solve(n - 1) + solve(n - 2);
	}
}
