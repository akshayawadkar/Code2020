
import java.util.ArrayList;
import java.util.List;

public class _19_Combinations {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int k = 2;

		solve(arr, k);

	}

	private static void solve(int[] arr, int k) {

		List<Integer> subList = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();

		helper(arr, k, 0, subList, result);

		System.out.println(result);

	}

	private static void helper(int[] arr, int k, int idx, List<Integer> subList, List<List<Integer>> result) {

		if (k > arr.length) {
			return;
		}

		if (k == 0) {
			result.add(new ArrayList<>(subList));
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			subList.add(arr[i]);
			helper(arr, k - 1, i + 1, subList, result);
			subList.remove(subList.size() - 1);
		}

	}
}
