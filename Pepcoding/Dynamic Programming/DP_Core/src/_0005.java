import java.util.Arrays;

public class _0005 {

	static Boolean[][] dp;

	public static void main(String[] args) {

		int[] arr = { 3, 34, 4, 12, 5, 2 };

		int sum = 30;
		int n = arr.length;
		dp = new Boolean[n + 1][sum + 1];
		boolean result = solve(arr, sum, n);
		System.out.println(result);
		
		for(Boolean[] d : dp) {
			System.out.println(Arrays.toString(d));
		}

	}

	private static boolean solve(int[] arr, int sum, int n) {

		if (sum == 0) {
			return dp[n][sum] = true;
		}

		if (n <= 0 || sum < 0) {
			return dp[n][sum] = false;
		}

		if(dp[n][sum] != null) {
			return dp[n][sum];
		}
		
		if (arr[n - 1] <= sum) {
			return dp[n][sum] = solve(arr, sum, n - 1) || solve(arr, sum - arr[n - 1], n - 1);
		} else {
			return dp[n][sum] = solve(arr, sum, n - 1);
		}
	}
}
