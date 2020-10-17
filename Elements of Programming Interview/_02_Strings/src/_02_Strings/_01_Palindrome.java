package _02_Strings;

public class _01_Palindrome {

	
	public static void main(String[] args) {
		
		String ip = "abissba";
		
		boolean result = isPalindrome(ip);
		System.out.println(result);
		
	}

	private static boolean isPalindrome(String ip) {
		
		int i = 0, j = ip.length() - 1;
		
		while(i <= j) {
			if(ip.charAt(i) != ip.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
		
		return true;
	}
}
