import java.util.Arrays;

public class _01_FindThePairWithGivenSum {

	public static void main(String[] args) {

		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		solve(arr, sum);
	}

	private static void solve(int[] arr, int sum) {

		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;

		while (left <= right) {

			if (arr[left] + arr[right] == sum) {
				System.out.println("pair found " + arr[left] + " " + arr[right]);
				return;
			}

			if (arr[left] + arr[right] > sum) {
				right--;
			} else {
				left++;
			}

		}
	}
}
