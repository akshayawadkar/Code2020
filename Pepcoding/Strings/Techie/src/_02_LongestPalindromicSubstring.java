
public class _02_LongestPalindromicSubstring {
	int start = 0, end = 0;

	public String longestPalindrome(String s) {

		if (s.length() == 0) {
			return "";
		}

		for (int i = 0; i < s.length(); i++) {
			adc(s, i, i);
			adc(s, i, i + 1);
		}

		return s.substring(start, start + end);
	}

	private void adc(String s, int left, int right) {

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}

		if (right - left - 1 > end) {
			end = right - left - 1;
			start = left + 1;
		}

	}
}
