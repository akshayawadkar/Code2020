import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _22_SubarrayWithSumK {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 0, 9, 7, 3, 1, 4, 1, 10 };
		int k = 15;

//		solve(arr, k);
		solve2(arr, k);

	}

	private static void solve2(int[] arr, int k) {

		Map<Integer, List<Integer>> map = new HashMap<>();
		List<Integer> tmp = new ArrayList<>(Arrays.asList(0));
		map.put(0, tmp);

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (map.containsKey(sum - k)) {
				for (int j : map.get(sum - k)) {
					System.out.println((j + 1) + " " + i);
				}
			}

			if (map.containsKey(sum)) {
				map.get(sum).add(i);
			} else {
				map.put(sum, new ArrayList<>());
				map.get(sum).add(i);
			}

		}

	}

	private static void solve(int[] arr, int k) {

		int left = 0, right = 0;
		int sum = 0;

		while (right < arr.length) {
			sum += arr[right];

			while (sum >= k) {
				if (sum == k) {
					System.out.println((left + "," + right));
				}
				sum -= arr[left];
				left++;
			}

			if (sum == k) {
				System.out.println((left + "," + right));
			}
			right++;
		}

	}
}
