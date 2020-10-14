
public class _10_AllRepeatingOneMissing {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 2, 7 };
		solve(arr);
	}

	private static void solve(int[] arr) {

		int n = arr.length;

		int xor = 0;

		for (int i : arr) {
			xor = xor ^ i;
		}

		for (int i = 1; i <= n; i++) {
			xor = xor ^ i;
		}

		int num1 = 0, num2 = 0;

		int rmbm = xor & (-xor);

		for (int i : arr) {
			if ((i & rmbm) == 0) {
				num1 = num1 ^ i;
			} else {
				num2 = num2 ^ i;
			}
		}

		System.out.println(num1 + " " + num2);
	}
}