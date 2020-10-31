
public class _01_CkeckIfStringIsRotatedPalindrome {

	public static void main(String[] args) {
		String ip = "ABCDCBA";
		boolean result = solve(ip);
		System.out.println(result);
	}

	private static boolean solve(String ip) {
		int n = ip.length();
		String tmp = ip + ip;
		
		if(longestPalindromicSubstring(ip).length() == n) {
			return true;
		}
		
		return false;
	}

	static int left = 0, right = 0;
	private static String longestPalindromicSubstring(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			adc(s, i, i);
			adc(s, i, i + 1);
			
		}
		
		return s.substring(left, left + right);
	}

	private static void adc(String s, int i, int j) {
		 
		while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		
		if(j - i - 1 > right) {
			right = j - i - 1;
			left = i + 1;
		}
		
	}
}
