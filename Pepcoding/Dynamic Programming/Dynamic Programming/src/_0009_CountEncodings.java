
public class _0009_CountEncodings {
	
	static char[] map;
	public static void main(String[] args) {
		
		map = " abcdefghijklmnopqrstuvwxyz".toCharArray();
		String ip = "231011";
		
		int result = solve(ip, 0, "");
		System.out.println();
		System.out.println(result);
	}
	private static int solve(String ip, int idx, String curr) {
		 
		if(idx == ip.length()) {
			System.out.println(curr);
			return 1;
		}
		
		if(idx > ip.length()) {
			return 0;
		}
		
		if(ip.charAt(idx) == '0') {
			return 0;
		}
		
		if(idx == ip.length() - 1) {
			System.out.println(curr + map[ip.charAt(ip.length() - 1) - '0']);
			return 1;
		}
		
		
		
		
		int oneDigit = Integer.valueOf(ip.substring(idx, idx + 1));
		int twoDigit = Integer.valueOf(ip.substring(idx, idx + 2));
		
		int result = 0;
		
		if(oneDigit > 0) {
			result += solve(ip, idx + 1, curr + map[oneDigit]);
		}
		
		if(twoDigit >= 10 && twoDigit <= 26) {
			result += solve(ip, idx + 2, curr + map[twoDigit]);
		}
		
		
		return result;
	}

}
