import java.util.*;
import java.util.Map.Entry;

public class _0020_PrintPermutations {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		solve(arr);
	}

	private static void solve(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		int[] key = new int[map.size()];
		int[] value = new int[map.size()];
		int idx = 0;

		for (Entry entry : map.entrySet()) {

			key[idx] = (int) entry.getKey();
			value[idx++] = (int) entry.getValue();

		}
		int[] result = new int[arr.length];
		helper(key, value, 0, result);

	}

	private static void helper(int[] key, int[] count, int level, int[] result) {
		if (level == result.length) {
			System.out.println(Arrays.toString(result));
			return;
		}

		for (int i = 0; i < key.length; i++) {

			if (count[i] == 0) {
				continue;
			}

			count[i]--;
			result[level] = key[i];
			helper(key, count, level + 1, result);
			count[i]++;
		}
	}

}
