
public class _0007 {

	public static void main(String[] args) {

		int[] arr = {1, 5, 11, 5};
		int n = arr.length;
		boolean result = solve(arr, n);
		System.out.println(result);

	}

	private static boolean solve(int[] arr, int n) {
	 
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		
		if(sum % 2 != 0) {
			return false;
		}
		
		
		
		return solve(arr, sum / 2, n);
	}

	private static boolean solve(int[] arr, int sum, int n) {

		boolean[][] dp = new boolean[n + 1][sum + 1];
		
		for(int i = 0; i < dp.length; i++) {
			dp[i][0] = true;
		}
		
		
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[0].length; j++) {
				
				if(arr[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
				}else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		
		return dp[n][sum];
	}
}
