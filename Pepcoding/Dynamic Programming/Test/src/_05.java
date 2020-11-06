import java.util.Arrays;

//Coin Change Permutations
public class _05 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5 };
		int amount = 7;
		solve2(arr, amount);

	}

	private static void solve2(int[] arr, int amount) {
		
		int n = arr.length;
		int[] dp = new int[amount + 1];
		dp[0] = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < dp.length; j++) {
				if(arr[i] <= j) {
					dp[j] += dp[j - arr[i]];
				}
			}
		}
		
		System.out.println(Arrays.toString(dp));

	}

	private static void solve(int[] arr, int amount) {

		int[][] dp = new int[arr.length + 1][amount + 1];

		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {

				if (arr[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j] + dp[i][j - arr[i - 1]];
				} else {
					dp[i][j] = dp[i - 1][j];
				}

			}
		}

		for (int[] d : dp) {
			System.out.println(Arrays.toString(d));
		}

	}
}
