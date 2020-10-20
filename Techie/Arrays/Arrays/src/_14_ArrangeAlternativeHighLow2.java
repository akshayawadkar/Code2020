import java.util.Arrays;

public class _14_ArrangeAlternativeHighLow2 {

	public static void main(String[] args) {

//		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr = { 9, 6, 8, 11, 7};
		
		solve(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void solve(int[] arr) {

		for (int i = 1; i < arr.length; i = i + 2) {
			if (arr[i] < arr[i - 1]) {
				swap(arr, i - 1, i);
			}
			
			if(i + 1 < arr.length && arr[i] < arr[i + 1]) {
				swap(arr, i + 1, i);
			}
		}

	}

	private static void swap(int[] arr, int left, int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}

}
