
public class _0005_Goldmine {

	public static void main(String[] args) {

		int[][] arr = { { 0, 1, 4, 2, 8, 2 },
						{ 4, 3, 6, 5, 0, 4 }, 
						{ 1, 2, 4, 1, 4, 6 },
						{ 2, 0, 7, 3, 2, 2 },
						{ 3, 1, 5, 9, 2, 4 },
						{ 2, 7, 0, 8, 5, 1 }};

		int result = solve(arr);

		System.out.println(result);

	}

	private static int solve(int[][] arr) {

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, solve(arr, i, 0));
		}

		return max;
	}

	private static int solve(int[][] arr, int i, int j) {

		if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length) {
			return 0;
		}
 
		return Math.max(solve(arr, i - 1, j + 1), 
				Math.max(solve(arr, i, j + 1), solve(arr, i + 1, j + 1))) + arr[i][j];

	}

}
