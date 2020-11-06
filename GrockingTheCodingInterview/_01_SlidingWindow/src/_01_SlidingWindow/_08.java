package _01_SlidingWindow;

public class _08 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1 };
		int k = 3;

		solve(arr, k);
	}

	private static void solve(int[] arr, int k) {

		int left = 0, right = 0;
		int max = 0;
		while (right < arr.length) {

			if (arr[right] == 0) {
				k--;
			}

			while (k < 0) {

				if (arr[left] == 0) {
					k++;
				}

				left++;
			}

			max = Math.max(max, right - left + 1);
			right++;

		}

		System.out.println(max);

	}

}
