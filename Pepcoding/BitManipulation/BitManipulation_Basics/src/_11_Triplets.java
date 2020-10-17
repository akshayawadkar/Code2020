
public class _11_Triplets {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 3, 5, 5, 2 };
		int count = solve(arr);
		System.out.println(count);
	}

	private static int solve(int[] arr) {

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int xor = arr[i];
			for (int k = i + 1; k < arr.length; k++) {
				xor = xor ^ arr[k];

				if (xor == 0) {
					cnt = cnt + (k - i);
				}
			}
		}

		return cnt;
	}

}
