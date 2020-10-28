
public class LPS_1 {
	public static void main(String[] args) {

		String x = "ABBDCACB";
		String y = new StringBuilder(x).reverse().toString();
		int result = solve(x, y, x.length(), y.length());

		System.out.println(result);

	}

	private static int solve(String x, String y, int m, int n) {

		if (m == 0 || n == 0) {
			return 0;
		}

		if (x.charAt(m - 1) == y.charAt(n - 1)) {
			return solve(x, y, m - 1, n - 1) + 1;
		}

		return Math.max(solve(x, y, m - 1, n),
						solve(x, y, m, n - 1));
	}
}
