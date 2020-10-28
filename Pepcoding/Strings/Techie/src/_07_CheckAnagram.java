import java.util.*;

public class _07_CheckAnagram {

	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char ch : t.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) - 1);
				if (map.get(ch) == 0) {
					map.remove(ch);
				}
			}
		}

		return map.isEmpty();
	}

	public static void main(String[] args) {

	}
}