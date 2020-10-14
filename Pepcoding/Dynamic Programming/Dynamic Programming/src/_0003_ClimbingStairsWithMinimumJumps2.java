import java.util.Arrays;

public class _0003_ClimbingStairsWithMinimumJumps2 {
	
	
	public static void main(String[] args) {
		
//		int[] arr = {3, 3, 1, 2, 2, 3};
		int[] arr = {2,3,1,1,4};
		
		int n = arr.length;
		
		int result = (int) solve(arr);
		System.out.println(result);
		
	}

	private static long solve(int[] arr) {
		
		 int[] dp = new int[arr.length];
		 
		 Arrays.fill(dp, Integer.MAX_VALUE);
		 
		 dp[0] = 0;
		 
		 for(int i = 1; i < arr.length; i++) {
			 for(int j = 0; j < i; j++) {
				 if(j + arr[j] >= i) {
					 dp[i] = Math.min(dp[i], dp[j] + 1);
				 }
			 }
		 }
		 
		 System.out.println(Arrays.toString(dp));
		 return dp[dp.length - 1];
	}

}
