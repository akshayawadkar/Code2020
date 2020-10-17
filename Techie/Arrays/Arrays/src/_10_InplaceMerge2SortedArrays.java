import java.util.Arrays;

public class _10_InplaceMerge2SortedArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 7, 8, 10 };
		int[] arr2 = { 4, 5, 6, 9 };

		solve(arr1, arr2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

	private static void solve(int[] X, int[] Y) {
		int m = X.length;
		int n = Y.length;

		for (int i = 0; i < m; i++) {

			if (X[i] > Y[0]) {
				swap(X, Y, i, 0);
				int first = Y[0];

				int k;
				for (k = 1; k < n && Y[k] < first; k++) {
					System.out.println("k is " + k);
					Y[k - 1] = Y[k];
				}
				Y[k - 1] = first;
			}

		}
	}

	private static void swap(int[] x, int[] y, int i, int j) {
		int tmp = x[i];
		x[i] = y[j];
		y[j] = tmp;

	}
}
