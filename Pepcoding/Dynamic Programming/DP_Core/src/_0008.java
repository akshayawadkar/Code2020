
public class _0008 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 6, 8, 10 };

		int sum = 10;
		int n = arr.length;
		int countSubset = getSubsetCount(arr, sum, n);

		System.out.println(countSubset);
	}

	private static int getSubsetCount(int[] arr, int sum, int n) {

		if (sum == 0) {
			return 1;
		}

		if (sum < 0 || n == 0) {
			return 0;
		}

		if (arr[n - 1] <= sum) {
			return getSubsetCount(arr, sum, n - 1) + getSubsetCount(arr, sum - arr[n - 1], n - 1);
		} else {
			return getSubsetCount(arr, sum, n - 1);
		}
	}
}
