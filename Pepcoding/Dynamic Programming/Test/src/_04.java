import java.util.Arrays;

public class _04 {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 0, 2, 4 };

//		int result = (int)solve(arr, 0);
		int result = solve2(arr);
		System.out.println(result);

	}

	private static int solve2(int[] arr) {

		int n = arr.length;
		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(j + arr[j] >= i ) {
					dp[i] = Math.min(dp[i], dp[j] + 1);
				}
			}
		}
		
		System.out.println(Arrays.toString(dp));
		return 0;
	}

	private static long solve(int[] arr, int idx) {

		if (idx > arr.length) {
			return Integer.MAX_VALUE;
		}

		if (idx == arr.length) {
			return 0;
		}

		long min = Integer.MAX_VALUE;

		for (int i = 1; i <= arr[idx]; i++) {
			min = Math.min(min, 1 + solve(arr, idx + i));
		}

		return min;
	}
}
