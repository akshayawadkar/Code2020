package _Topic_3_CountSubseq;

public class _MaximumSumWithNonAdjacentElements {

	public static void main(String[] args) {

		int[] arr = { 5, 10, 10, 100, 5, 6 };

		int maxNonAdjSum = solve(arr);
		System.out.println(maxNonAdjSum);

	}

	private static int solve(int[] arr) {

		int oinc = arr[0], oexcl = 0;

		for (int i = 1; i < arr.length; i++) {
			int ninc = oexcl + arr[i];
			int nexcl = Math.max(oinc, oexcl);
			
			oinc = ninc;
			oexcl = nexcl;
		}

		return Math.max(oinc, oexcl);
	}

}
