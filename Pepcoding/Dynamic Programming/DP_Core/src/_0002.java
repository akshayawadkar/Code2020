import java.util.Arrays;

public class _0002 {
	
	static Integer[][] dp;
	public static void main(String[] args) {
		
		int[] values = {60, 100 ,120};
		int[] weights = {10, 20 ,30};
		int W = 50;
		int n = values.length;
		dp = new Integer[n + 1][W + 1];
		int maxProfit = solve(weights, values, W, n);
		System.out.println(maxProfit);
		
		for(Integer[] d : dp) {
			System.out.println(Arrays.toString(d));
		}
		
	}

	private static int solve(int[] weights, int[] values, int W, int n) {
		 
		
		if(n == 0) {
			return dp[n][W] = 0;
		}
		
		if(dp[n][W] != null) {
			return dp[n][W];
		}
		
		if(weights[n - 1] <= W) {
			return dp[n][W] = Math.max(solve(weights, values, W, n - 1),
					 		values[n - 1] + solve(weights, values, W - weights[n - 1], n - 1));
		}else {
			return dp[n][W] = solve(weights, values, W, n - 1);
		} 
	}

}
