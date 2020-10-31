
public class _26_BalancedParenthesis2 {

	public static void main(String[] args) {

		int n = 3;
		solve(n, n, "");

	}

	private static void solve(int left, int right, String curr) {

		if (left == 0 && right == 0) {
			System.out.println(curr);
			return;
		}

		if (left > 0) {
			solve(left - 1, right, curr + "(");
		}

		if (right > left) {
			solve(left, right - 1, curr + ")");
		}

	}

}
