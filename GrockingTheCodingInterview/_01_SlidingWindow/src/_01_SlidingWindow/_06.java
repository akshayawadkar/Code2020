package _01_SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class _06 {

	// longest substring with no rep chars

	public static void main(String[] args) {

		String s = "pwwkew";
		solve(s);

	}

	private static void solve(String s) {

		Set<Character> set = new HashSet<Character>();

		int max = 0;

		int left = 0, right = 0;
		while (right < s.length()) {
			char ch = s.charAt(right);

			System.out.println(left + " " + right + " " + s.substring(left, right + 1));
			if (set.contains(ch)) {
				ch = s.charAt(left);
				set.remove(ch);
				left++;
			} else {
				set.add(ch);
				max = Math.max(max, set.size());
				right++;
			}

//			System.out.println("here");
		}

		System.out.println(max);

	}

}
