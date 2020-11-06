import java.util.Arrays;

//Coin Change Combinations

public class _06 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 6 };
		int amount = 10;
		solve2(arr, amount);

	}

	private static void solve2(int[] arr, int amount) {

		int n = arr.length;
		int[] dp = new int[amount + 1];
		dp[0] = 1;

		for (int j = 1; j < dp.length; j++) {
			for (int i = 0; i < n; i++) {
				if (arr[i] <= j) {
					dp[j] += dp[j - arr[i]];
				}
			}
		}

		System.out.println(Arrays.toString(dp));

	}

}
