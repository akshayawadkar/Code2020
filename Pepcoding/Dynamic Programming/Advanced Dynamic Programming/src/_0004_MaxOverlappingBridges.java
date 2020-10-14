import java.util.Arrays;

public class _0004_MaxOverlappingBridges {
	
	public static void main(String[] args) {
		
		int[][] arr = {{6, 2}, {4, 3}, {2, 6}, {1, 5}};
		
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println();
		
		int maxNonOverlappingBridges = solve(arr);
		
		System.out.println(maxNonOverlappingBridges);
		
		
	}

	private static int solve(int[][] arr) {
	 
		Arrays.sort(arr, (a, b) ->{
			return a[0] - b[0];
		});
		
		
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);
		
		int max = 0;
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				
				if(arr[i][1] > arr[j][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
				
			}
			max = Math.max(max,dp[i]);
		}
		
		return max;
	}

}
