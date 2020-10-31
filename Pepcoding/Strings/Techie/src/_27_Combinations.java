import java.util.LinkedList;

public class _27_Combinations {

	public static void main(String[] args) {

		String s = "ABC";
		int k = 2;
		int n = s.length();

		solve(s, k, n, "", 0);

	}

	private static void solve(String s, int k, int n, String curr, int idx) {

		if (k == 0) {
			System.out.println(curr);
			return;
		}

		for (int i = idx; i < n; i++) {

			solve(s, k - 1, n, curr + s.charAt(i), i + 1);

		}

	}

}
