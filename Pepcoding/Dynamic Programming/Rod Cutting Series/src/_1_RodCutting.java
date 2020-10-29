import java.util.Arrays;
import java.util.Stack;

public class _1_RodCutting {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int[] newArr = new int[arr.length + 1];
		for (int i = 1; i < newArr.length; i++) {
			newArr[i] = arr[i - 1];
		}
//		solve(newArr);
		solve2(newArr);
	}

	private static void solve2(int[] arr) {
		System.out.println(Arrays.toString(arr));
		int n = arr.length;
		int[] dp = new int[n];
		
		dp[1] = arr[1];
		
		for(int i = 2; i < n; i++) {
			int left = 1, right = i - 1;
			int max = arr[i];
			while(left <= right) {
				max = Math.max(max, dp[left] + dp[right]);
				left++;
				right--;
			}
			dp[i] = max;
		}
		System.out.println(Arrays.toString(dp));
	}

	private static void solve(int[] arr) {

		System.out.println(Arrays.toString(arr));

		int[] dp = new int[arr.length];
		dp[1] = arr[1];

		int n = arr.length;

		for (int i = 2; i < n; i++) {
			int max = 0;
			for (int j = 1; j <= i; j++) {
				max = Math.max(max, arr[j] + dp[i - j]);
			}
			dp[i] = max;
		}

		System.out.println(Arrays.toString(dp));
	}
}