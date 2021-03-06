import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String s = "0";
		int result = solve(s, 0);

		System.out.println(result);
	}

	private static int solve(String s, int idx) {

		if (idx > s.length()) {
			return 0;
		}

		if (idx == s.length()) {
			return 1;
		}
		if (s.charAt(idx) == '0') {
			return 0;
		}

		if (idx == s.length() - 1) {
			return 1;
		}

		int result = 0;
		int oneDigit = Integer.valueOf(s.substring(idx, idx + 1));
		int twoDigit = Integer.valueOf(s.substring(idx, idx + 2));

		if (oneDigit > 0) {
			result += solve(s, idx + 1);
		}

		if (twoDigit >= 10 && twoDigit <= 26) {
			result += solve(s, idx + 2);
		}

		return result;
	}
}