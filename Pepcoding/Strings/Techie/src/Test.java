import java.util.*;

public class Test {

	public static void main(String[] args) {

		String x = "gt";
		String y = "igh";

		int result = solve2(x, y, 0, 0);
		System.out.println(result);
	}

	private static int solve2(String x, String y, int i, int j) {

		if (i == x.length()) {
			return y.length() - j;
		}

		if (j == y.length()) {
			return x.length() - i;
		}

		if (x.charAt(i) == y.charAt(j)) {
			return solve2(x, y, i + 1, j + 1);
		} else {
			return min(solve2(x, y, i, j + 1),
						solve2(x, y, i + 1, j),
						solve2(x, y, i + 1, j + 1)) + 1;
		}

	}

	private static int solve(String s, String t) {

		if (s.length() == 0) {
			return t.length();
		}

		if (t.length() == 0) {
			return s.length();
		}

		if (s.charAt(0) == t.charAt(0)) {
			return solve(s.substring(1), t.substring(1));
		} else {
			return min(solve(s.substring(1), t), solve(s, t.substring(1)), solve(s.substring(1), t.substring(1))) + 1;
		}

	}

	private static int min(int a, int b, int c) {

		return Math.min(Math.min(a, b), c);
	}

}
