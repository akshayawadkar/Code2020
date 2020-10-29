import java.util.Arrays;

public class _3_MCM {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		solve(arr);

	}

	private static void solve(int[] arr) {

		int n = arr.length;
		int[][] dp = new int[n - 1][n - 1];

		n = n - 1;
		for (int dig = 0; dig < n; dig++) {
			for (int i = 0, j = dig; i < n - dig; i++, j++) {
				
				if(dig == 0) {
					dp[i][j] = 0;
				}else if(dig == 1) {
					dp[i][j] = arr[i] * arr[j] * arr[j + 1];
				}else {
					int min = Integer.MAX_VALUE;
					for(int k = i; k < j; k++) {
						int a = dp[i][k];
						int b = dp[k + 1][j];
						int tmpMul = arr[i] * arr[k + 1] * arr[j + 1 ];
						min = Math.min(min, a + b + tmpMul);
					}
					dp[i][j] = min;
				}

			}
		}
		
		
		for(int[] d : dp) {
			System.out.println(Arrays.toString(d));
		}

	}
}
