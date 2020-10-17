import java.util.*;

class _02_CheckIfSubarrayWithSum0Exists {

	public static void main(String[] args) {

		int[] A = { -4, 3, -6, 7 };
		boolean result = solve(A);
		System.out.println(result);

	}

	private static boolean solve(int[] A) {

		Set<Integer> set = new HashSet<>();
		int sum = 0;
		set.add(0);
		for (int i = 0; i < A.length; i++) {
			sum += A[i];

			if (set.contains(sum)) {
				return true;
			}

			set.add(sum);
		}

		return false;
	}

}
