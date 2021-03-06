import java.util.Arrays;

public class _0010 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 7 };

		int minSubSetDiff = getMinDiff(arr, arr.length);
		System.out.println(minSubSetDiff);

	}

	private static int getMinDiff(int[] arr, int n) {

		int sum = 0;
		for (int i : arr) {
			sum += i;
		}

		boolean[] lastRow = solve(arr, sum, n);

		 
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < lastRow.length; i++) {
			if(lastRow[i]) {
				min = Math.min(min, Math.abs(sum - (2 * i)));
			}
		}

		return min;
	}

	private static boolean[] solve(int[] arr, int sum, int n) {

		boolean[][] dp = new boolean[n + 1][sum + 1];

		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = true;
		}

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {

				if (arr[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
 

		return dp[dp.length - 1];
	}
}
