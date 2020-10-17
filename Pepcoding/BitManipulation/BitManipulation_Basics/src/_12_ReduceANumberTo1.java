
public class _12_ReduceANumberTo1 {

	public static void main(String[] args) {

		int n = 15;
		int result = solve(n);
		System.out.println(result);

	}

	private static int solve(int n) {
		int result = 0;

		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else if (n == 3) {
				n = n - 1;
			} else if (n % 4 == 1) {
				n = n - 1;
			} else if (n % 4 == 3) {
				n = n + 1;
			}
			result++;
		}

		return result;
	}

}
