package _01_SlidingWindow;

import java.util.*;

public class _12 {

	// Minimum Window Substring

	public static void main(String[] args) {

		String s = "abdbca";
		String p = "abc";

		Integer[] result = solve(s, p);

		System.out.println(s.substring(result[0], result[1] + 1));
	}

	private static Integer[] solve(String s, String p) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : p.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		Integer[] result = { -1, -1 };
		int charsToCover = p.length();

		for (int left = 0, right = 0; right < s.length(); right++) {

			char ch = s.charAt(right);
			Integer cnt = map.get(ch);

			if (cnt != null) {
				map.put(ch, cnt - 1);
				if (cnt > 0) {
					charsToCover--;
				}
			}

			while (charsToCover == 0) {
				if (result[0] == -1 && result[1] == -1 || (result[1] - result[0] > right - left)) {
					result[0] = left;
					result[1] = right;
				}

				ch = s.charAt(left);
				cnt = map.get(ch);

				if (cnt != null) {
					map.put(ch, cnt + 1);
					if (map.get(ch) > 0) {
						charsToCover++;
					}
				}

				left++;
			}

		}

		return result;
	}
}
