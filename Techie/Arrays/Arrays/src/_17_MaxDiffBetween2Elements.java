import com.util.Subarray;

public class _17_MaxDiffBetween2Elements {

	public static void main(String[] args) {

		int arr[] = { 2, 7, 9, 5, 1, 3, 5 };

		System.out.println(solve(arr));

	}

	private static Subarray solve(int[] arr) {

		int max = 0;
		int min = Integer.MAX_VALUE;
		Subarray result = new Subarray(-1, -1);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

			if (max < arr[i] - min) {
				max = arr[i] - min;
				result.x = min;
				result.y = arr[i];
			}
//			min = Math.min(min, arr[i]);
//			max = Math.max(max, arr[i] - min);
		}

		return result;
	}
}
