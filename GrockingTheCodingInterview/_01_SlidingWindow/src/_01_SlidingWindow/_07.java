package _01_SlidingWindow;

import java.util.*;
import java.util.Set;

public class _07 {

	// Longest Substring with Same Letters after Replacement (hard)

	public static void main(String[] args) {

		String s = "aabccbb";
		int k = 2;
		solve(s, k);

	}

	private static void solve(String s, int k) {

		Map<Character, Integer> map = new HashMap<>();

		int maxLen = 0;
		int maxRepeatLetterCount = 0;

		for (int left = 0, right = 0; right < s.length(); right++) {

			char ch = s.charAt(right);

			map.put(ch, map.getOrDefault(ch, 0) + 1);
			maxRepeatLetterCount = Math.max(maxRepeatLetterCount, map.get(ch));
			
			
			if(right - left + 1 - maxRepeatLetterCount > k) {
				ch = s.charAt(left);
				map.put(ch, map.get(ch) - 1);
				left++;
			}
			
			maxLen = Math.max(maxLen, right - left + 1); 
		}

		System.out.println(maxLen);
	}

}
