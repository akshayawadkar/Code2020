import java.util.Arrays;

public class _0005_RussianDollEnvelope {

	public static void main(String[] args) {
//		int[][] arr = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } };
		int[][] arr = { {1, 1} };
		

		int result = solve(arr);
		System.out.println(result);
	}

	private static int solve(int[][] arr) {

		Arrays.sort(arr, (a, b) -> {

			if (a[0] == b[0]) {
				return b[1] - a[1];
			}
			return a[0] - b[0];

		});

		int result = 0;

		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {

				if (arr[i][1] > arr[j][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}

			}
			result = Math.max(result, dp[i]);
		}

		return result;
	}
}
