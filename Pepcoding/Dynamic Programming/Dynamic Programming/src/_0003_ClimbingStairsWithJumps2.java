import java.util.Arrays;

public class _0003_ClimbingStairsWithJumps2 {
	
	
	public static void main(String[] args) {
		
		int[] arr = {3, 3, 0, 2, 2, 3};
		int n = arr.length;
		
		int result = solve(arr, n);
		System.out.println(result);
		
	}

	private static int solve(int[] arr, int n) {
		
		// Step 1: Define the storage
		int[] dp = new int[n + 1];
		
		// Step 2: Understand the flow
		dp[dp.length - 1] = 1;
		
		
		// Step 3: Travel and solve
		for(int i = dp.length - 2; i >= 0; i--) {
			
			for(int j = 1; j <= arr[i]; j++) {
				 
				if(i + j < dp.length) {
					dp[i] += dp[i + j];
				}
			}
		}
		
		System.out.println(Arrays.toString(dp));
		
		return dp[0];
		 
	}

}
