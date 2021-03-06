import java.util.Arrays;

public class _0001_LIS {

	public static void main(String[] args) {
		
		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80, 3};
		int LIS  = solve(arr);
		System.out.println(LIS);
		
	}

	private static int solve(int[] arr) {
		
		int n = arr.length;
		int[] dp = new int[n];
		
		Arrays.fill(dp, 1);
		int max = 0;
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			
			max = Math.max(max, dp[i]);
		}
	
		
		return max;
	}
}
