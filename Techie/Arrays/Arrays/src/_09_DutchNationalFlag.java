import com.util.Subarray;
import java.util.*;

public class _09_DutchNationalFlag {

	public static void main(String[] args) {
//		int[] arr = { -10, -3, 5, 6, -2 }; // 30
		int[] arr = { -10, -3, 5, 6, -20 }; // 200

		int result = solve(arr);
		System.out.println(result);
	}

	private static int solve(int[] arr) {

		int max1 = Integer.MIN_VALUE, max2 = 0;
		int min1 = Integer.MAX_VALUE, min2 = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2) {
				max2 = arr[i];
			}

			if (arr[i] < min1) {
				min2 = min1;
				min1 = arr[i];
			} else if (arr[i] < min2) {
				min2 = arr[i];
			}

		}

		return Math.max(max2 * max1, min1 * min2);
	}
}
