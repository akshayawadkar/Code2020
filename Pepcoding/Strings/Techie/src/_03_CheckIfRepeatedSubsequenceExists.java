import java.util.*;

public class _03_CheckIfRepeatedSubsequenceExists {

	public static void main(String[] args) {
		String ip = "aabcxcbaa";
		boolean result = solve(ip);
		System.out.println(result);

	}

	private static boolean solve(String ip) {

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : ip.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

			if (map.get(ch) > 3) {
				return true;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (char ch : ip.toCharArray()) {
			if (map.get(ch) >= 2) {
				sb.append(ch);
			}
		}

		return !isPalindrome(sb.toString());
	}

	private static boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;

		while (left <= right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
