
public class _0006TargetSumSubSets {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 9, 7};
		int sum = 13;
		
		boolean result = solve(arr, sum, arr.length - 1);
		
		System.out.println(result);
		
	}

	private static boolean solve(int[] arr, int sum, int idx) {
	 
		boolean[][] dp = new boolean[arr.length + 1][sum + 1];
		
		
		for(int i = 0; i < dp.length; i++) {
			dp[i][0] = true;
		}
		
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[0].length; j++) {
				if(arr[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
				}else {
					dp[i][j] = false;
				}
			}
		}
		
		return dp[dp.length - 1][dp[0].length - 1];
	}

}
