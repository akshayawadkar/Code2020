package _01_SlidingWindow;

import java.util.*;

public class _04 {

	// Longest Substring with K Distinct Chars

	public static void main(String[] args) {

		String s = "araaci";
		int k = 2;

		solve(s, k);

	}

	private static void solve(String s, int k) {

		Map<Character, Integer> map = new HashMap<>();

		int max = 0;

		for (int left = 0, right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);

			if (map.size() <= k) {
				max = Math.max(max, right - left + 1);
			} else {
				ch = s.charAt(left);
				if(map.containsKey(ch)) {
					map.put(ch, map.get(ch) - 1);
				}
				
				if(map.get(ch) <= 0) {
					map.remove(ch);
				}
				left++;
			}
		}

		System.out.println(max);

	}
}
