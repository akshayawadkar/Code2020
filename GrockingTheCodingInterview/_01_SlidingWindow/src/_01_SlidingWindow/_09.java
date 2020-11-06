package _01_SlidingWindow;

import java.util.*;

public class _09 {

	public static void main(String[] args) {

		String s = "oidbcdaf";
		String p = "abc";

		boolean result = solve(s, p);
		System.out.println(result);

	}

	private static boolean solve(String s, String p) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : p.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println(map);
		int charToCover = p.length();
		for (int left = 0, right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			Integer cnt = map.get(ch);

			if (cnt != null) {

				map.put(ch, map.get(ch) - 1);
				if (cnt > 0) {
					charToCover--;
				}

			}

			while (right - left + 1 > p.length()) {
				ch = s.charAt(left);
				cnt = map.get(ch);
				if (cnt != null) {

					map.put(ch, map.get(ch) + 1);
					if (map.get(ch) > 0) {
						charToCover++;
					}

				}
				left++;
			}

			if (charToCover == 0) {
				return true;
			}

		}

		return false;
	}

}
