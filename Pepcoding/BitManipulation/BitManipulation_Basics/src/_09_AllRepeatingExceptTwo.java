
public class _09_AllRepeatingExceptTwo {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 2, 3, 4, 4, 5 };
		solve(arr);
	}

	private static void solve(int[] arr) {

		int xxory = 0;
		for (int i : arr) {
			xxory = xxory ^ i;
		}

		int rsmb = xxory & (-xxory);

		int a = 0, b = 0;

		for (int i : arr) {
			if ((i & rsmb) == 0) {
				a = a ^ i;
			} else {
				b = b ^ i;
			}
		}

		System.out.println(a + " " + b);

	}
}
