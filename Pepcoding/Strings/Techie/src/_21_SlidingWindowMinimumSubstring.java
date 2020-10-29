import java.util.*;

public class _21_SlidingWindowMinimumSubstring {

	private static class Subarray {
		Integer start;
		Integer end;

		Subarray(Integer start, Integer end) {
			this.start = start;
			this.end = end;
		}

	}

	public String minWindow(String s, String t) {
		Subarray result = solve(s, t);
		if (result.start == -1 && result.end == -1) {
			return "";
		}
		return s.substring(result.start, result.end + 1);
	}

	private Subarray solve(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : t.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		Subarray result = new Subarray(-1, -1);
		int lettersToCover = t.length();

		for (int left = 0, right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			Integer cnt = map.get(ch);
			if (cnt != null) {
				map.put(ch, cnt - 1);
				if (cnt > 0) {
					lettersToCover--;
				}
			}

			while (lettersToCover == 0) {

				if (result.start == -1 && result.end == -1 || (result.end - result.start > right - left)) {
					result.start = left;
					result.end = right;
				}

				ch = s.charAt(left);
				cnt = map.get(ch);
				if (cnt != null) {
					map.put(ch, cnt + 1);
					if (map.get(ch) > 0) {
						lettersToCover++;
					}
				}
				left++;
			}

		}

		return result;
	}
}
