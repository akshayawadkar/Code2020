import java.util.HashMap;
import java.util.Map;

public class _24_FindAllSubstringsThatArePermutationsOfAGivenString {
	public static void main(String[] args) {

		String s1 = "XYYZXZYZXXYZ";
		String s2 = "XYZ";

		solve(s1, s2);

	}

	private static void solve(String s1, String s2) {

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : s2.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		int charsToCover = s2.length();

		Map<Character, Integer> map2 = new HashMap<>();
		for (int left = 0, right = 0; right < s1.length(); right++) {
			char ch = s1.charAt(right);
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);

			while (right - left + 1 > charsToCover) {
				ch = s1.charAt(left);
				map2.put(ch, map2.get(ch) - 1);
				if (map2.get(ch) <= 0) {
					map2.remove(ch);
				}
				left++;
			}

			if (right - left + 1 == charsToCover) {
				if (map2.equals(map)) {
					System.out.println(s1.substring(left, right + 1));
				}

			}

		}

	}
}
