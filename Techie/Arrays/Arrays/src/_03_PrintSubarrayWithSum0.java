import java.util.*;

class _03_PrintSubarrayWithSum0 {

	public static void main(String[] args) {

		int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		solve(A);

	}

	private static void solve(int[] arr) {

		Map<Integer, List<Integer>> map = new HashMap<>();
		map.put(0, new ArrayList<>());
		map.get(0).add(-1);

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (map.containsKey(sum)) {
//				System.out.println(map.get(sum) + 1 + "    " + i);

				for (int j : map.get(sum)) {
					System.out.println((j + 1) + "    " + i);
				}
			}

			map.putIfAbsent(sum, new ArrayList<>());
			map.get(sum).add(i);
		}

	}

}
