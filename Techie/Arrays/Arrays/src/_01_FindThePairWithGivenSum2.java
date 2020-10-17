import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class _01_FindThePairWithGivenSum2 {

	public static void main(String[] args) {

		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		solve(arr, sum);
	}

	private static void solve(int[] arr, int sum) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(sum - arr[i])) {
				System.out.println("Pair found " + map.get(sum - arr[i]) + " , " + i);
			}
			map.put(arr[i], i);
		}

	}
}
