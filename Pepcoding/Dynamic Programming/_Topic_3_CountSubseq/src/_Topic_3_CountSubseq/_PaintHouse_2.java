package _Topic_3_CountSubseq;

import java.util.Arrays;

public class _PaintHouse_2 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 5, 7, 2, 1, 4 },
						{ 5, 8, 4, 3, 6, 1 },
						{ 3, 2, 9, 7, 2, 3 },
						{ 1, 2, 4, 9, 1, 7 } };

//		int minCost = solve(arr);
		int minCost = solve2(arr);
		System.out.println(minCost);

	}

	private static int solve2(int[][] arr) {
		
		int[][] dp = new int[arr.length][arr[0].length];
		
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		
		for(int j = 0; j < dp[0].length; j++) {
			dp[0][j] = arr[0][j];
			if(arr[0][j] < min1) {
				min2 = min1;
				min1 = arr[0][j];
			}else if(arr[0][j] < min2) {
				min2 = arr[0][j];
			}
		}
		
		
		for(int i = 1; i < dp.length; i++) {
			int nmin1 = Integer.MAX_VALUE, nmin2 = Integer.MAX_VALUE;
			for(int j = 0; j < dp[0].length; j++) {
				
				if(min1 == dp[i-1][j]) {
					dp[i][j] = arr[i][j] + min2;
				}else {
					dp[i][j] = arr[i][j] + min1;
				}
				
				if(dp[i][j] < nmin1) {
					nmin2 = nmin1;
					nmin1 = dp[i][j];
				}else if(dp[i][j] < nmin2) {
					nmin2 = dp[i][j];
				}
			}
			min1 = nmin1;
			min2 = nmin2;
		}
		
		
		
		return Math.min(min1, min2);
	}

	private static int solve(int[][] arr) {

		int[][] dp = new int[arr.length][arr[0].length];

		dp[0] = arr[0].clone();

		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {

				int min = Integer.MAX_VALUE;
				for (int k = 0; k < dp[0].length; k++) {
					if (k != j) {
						min = Math.min(min, dp[i - 1][k]);
					}
				}
				dp[i][j] = arr[i][j] + min;
			}
		}

		for (int[] d : dp) {
			System.out.println(Arrays.toString(d));
		}

		int result = Integer.MAX_VALUE;

		for (int k = 0; k < dp.length; k++) {
			result = Math.min(result, dp[dp.length - 1][k]);
		}

		return result;
	}

}
