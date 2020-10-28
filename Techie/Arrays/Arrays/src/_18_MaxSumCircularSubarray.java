
public class _18_MaxSumCircularSubarray {

	public static void main(String[] args) {

		int[] arr = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };
		int maxSum = solve(arr);
		System.out.println(maxSum);

	}

	private static int solve(int[] arr) {

		int regularKadane = kadanes(arr);

		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
			arr[i] *= -1;
		}

		int negKadane = kadanes(arr);
		int tmp = total - (-negKadane);

		return Math.max(regularKadane, tmp);
	}

	private static int kadanes(int[] arr) {
		int maxTillHere = arr[0], maxTillNow = 0;

		for (int i = 0; i < arr.length; i++) {
			maxTillNow += arr[i];
			if (maxTillNow > maxTillHere) {
				maxTillHere = maxTillNow;
			}

			if (maxTillNow < 0) {
				maxTillNow = 0;
			}
		}

		return maxTillHere;
	}
}
