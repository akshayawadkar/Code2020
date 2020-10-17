import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _12_SampleOfflineData {

	private class Solution {

		int[] clone;
		int[] nums;

		public Solution(int[] nums) {
			this.nums = nums;
			this.clone = nums.clone();

		}

		/** Resets the array to its original configuration and return it. */
		public int[] reset() {
			return nums;
		}

		/** Returns a random shuffling of the array. */
		public int[] shuffle() {

			int n = clone.length;
			Random rnd = new Random();

			for (int i = 0; i < n; i++) {
				int tmp = rnd.nextInt(n - i);
				swap(clone, i, tmp);
			}
			return clone;
		}

		private void swap(int[] arr, int left, int right) {
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 3, 7, 5, 11 };
		int k = 3;
		shuffle(arr, k);
		System.out.println(Arrays.toString(arr));

	}

	private static void shuffle(int[] arr, int k) {

		Random rnd = new Random();

		for (int i = 0; i < k; i++) {
			int j = rnd.nextInt(k - i);
			swap(arr, i, j);
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;

	}

}
