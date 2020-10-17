import java.util.*;

public class _5_LargestSubarrayWithSum0 {

	public static void main(String[] args) {

//		int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
//		int[] arr = {1,0,3};

		int[] arr = { 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4 };
		int result = solve(arr);
		System.out.println(result);

	}

	private static int solve(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		map.put(0, -1);
		int sum = 0;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (map.containsKey(sum)) {
				result = Math.max(result, i - map.get(sum));
			}

			map.putIfAbsent(sum, i);
		}

		return result;
	}
}
