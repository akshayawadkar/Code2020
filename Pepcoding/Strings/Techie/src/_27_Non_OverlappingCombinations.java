import java.util.LinkedList;

public class _27_Non_OverlappingCombinations {

	public static void main(String[] args) {

		String s = "ABC";
		solve(s, "");

	}

	private static void solve(String s, String curr) {

		if (s.length() == 0) {
			System.out.println(curr);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			String tmp = curr;
			solve(s.substring(i + 1), curr + "(" + s.substring(0, i + 1) + ")");
			curr = tmp;
		}

	}
}
