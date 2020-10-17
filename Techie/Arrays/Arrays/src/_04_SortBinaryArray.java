import java.util.*;

class _04_SortBinaryArray {

	public static void main(String[] args) {
		int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
		solve(A);
		System.out.println(Arrays.toString(A));

	}

	private static void solve(int[] arr) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {
			if(arr[left] == 0) {
				left++;
			}else {
				swap(arr, left, right--);
			}
		}

	}

	private static void swap(int[] arr, int left, int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}

}
