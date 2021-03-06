
public class _0009 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 6, 8, 10 };

		int sum = 10;
		int n = arr.length;
		int countSubset = getSubsetCount(arr, sum, n);

		System.out.println(countSubset);
	}

	private static int getSubsetCount(int[] arr, int sum, int n) {
		
		int[][] dp = new int[n + 1][sum + 1];
		
		for(int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[0].length; j++) {
				if(arr[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
				}else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		
		return dp[n][sum];
	}
}
