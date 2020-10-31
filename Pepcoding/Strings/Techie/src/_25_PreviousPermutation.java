import java.util.Arrays;

public class _25_PreviousPermutation {
	public static void main(String[] args) {

		int[] arr = { 5, 3, 2, 4, 1, 6 };

		solve(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void solve(int[] arr) {

		int i = arr.length - 2;
		while (i >= 0 && arr[i] < arr[i + 1]) {
			i--;
		}

		int j = arr.length - 1;

		while (j > i) {
			if (arr[j] < arr[i]) {
				break;
			}
			j--;
		}

		swap(arr, i, j);
		reverse(arr, i + 1, arr.length - 1);

	}

	private static void reverse(int[] arr, int i, int k) {

		while (i <= k) {
			int tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
			i++;
			k--;
		}

	}

	private static void swap(int[] arr, int i, int k) {

		int tmp = arr[i];
		arr[i] = arr[k];
		arr[k] = tmp;

	}

}
