import java.util.HashMap;
import java.util.Map;

public class _7_MinimumWIndowSubstring {

	private static class Subarray {
		Integer x;
		Integer y;

		public Subarray(Integer x, Integer y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) {

		String s = "ADOBECODEBANC", t = "ABC";
		Subarray result = solve(s, t);

		System.out.println(s.substring(result.x, result.y + 1));

	}

	private static Subarray solve(String s, String t) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : t.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		Subarray result = new Subarray(-1, -1);
		int charsToCover = t.length();

		for (int left = 0, right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			Integer cnt = map.get(ch);
			if (cnt != null) {
				map.put(ch, cnt - 1);
				if (cnt > 0) {
					charsToCover--;
				}
			}
			
			
			while(charsToCover == 0) {
			
				if(result.x == -1 && result.y == -1 || (result.y - result.x) > right - left) {
					result.x = left;
					result.y = right;
				}
				
				ch = s.charAt(left);
				cnt = map.get(ch);
				
				if(cnt != null) {
					map.put(ch, cnt + 1);
					if(map.get(ch) > 0) {
						charsToCover++;
					}
				}
				left++;
			}

		}

		return result;
	}

}