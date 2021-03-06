import java.util.Arrays;

public class _0002_MaximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		  
		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80, 1};
		int result  = solve(arr);
		System.out.println(result);
		
	}

	private static int solve(int[] arr) {
		
		int[] dp = arr.clone();
		
		int max = 0;
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], arr [i] + dp[j]);
				}
			}
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(Arrays.toString(dp));
		
		return max;
	}

	 
}
