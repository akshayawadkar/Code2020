import java.util.*;

public class _0023_TargetSumSubset {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 60;

		solve(arr, sum);
	}

	private static void solve(int[] arr, int sum) {

		List<Integer> subList = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();

		solve(arr, sum, 0, subList, result);

		System.out.println(result);
	}

	private static void solve(int[] arr, int sum, int idx, List<Integer> subList, List<List<Integer>> result) {

		if (idx == arr.length) {
			return;
		}

		if (sum == 0) {
			result.add(new ArrayList<>(subList));
			return;
		}

		if (arr[idx] <= sum) {
			subList.add(arr[idx]);
			solve(arr, sum - arr[idx], idx + 1, subList, result);
			subList.remove(subList.size() - 1);
			solve(arr, sum, idx + 1, subList, result);
		} else {
			solve(arr, sum, idx + 1, subList, result);
		}

	}
}