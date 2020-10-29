import java.util.HashMap;
import java.util.Map;

public class _23_LongestSubstringContainingKDistinctChars {

	private static class Subarray {
		Integer start;
		Integer end;

		Subarray(Integer start, Integer end) {
			this.start = start;
			this.end = end;
		}

	}

	public static void main(String[] args) {

		String ip = "abcbdbdbbdcdabd";
		int k = 3;

		solve(ip, k);

	}

	private static void solve(String s, int k) {

		Subarray result = new Subarray(-1, -1);
		int max = 0;
		Map<Character, Integer> map = new HashMap<>();

		for (int left = 0, right = 0; right < s.length(); right++) {

			char ch = s.charAt(right);

			map.put(ch, map.getOrDefault(ch, 0) + 1);
			
			if(map.size() <= k) {
				if(right - left > max) {
					max = right - left;
					result.start = left;
					result.end = right;
				}
			}else {
				ch = s.charAt(left);

				map.put(ch, map.getOrDefault(ch, 0) - 1);
				
				if(map.get(ch) <= 0) {
					map.remove(ch);
				}
				left++;
			}

		}

		System.out.println(s.substring(result.start, result.end + 1));
	}
}
