
public class _0021_PrintEncodings {
	
	static char[] arr;
	public static void main(String[] args) {
		
		String ip = "1234";
		arr = " abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		solve(ip, 0, "");
	}
	private static void solve(String ip, int idx, String curr) {
		 
		if(idx == ip.length()) {
			System.out.println(curr);
			return;
		}
		
		
		
		if(idx == ip.length() - 1) {
			System.out.println(curr + arr[ip.charAt(idx) - '0']);
			return;
		}
		 
		
		
		int oneDigit = Integer.valueOf(ip.substring(idx, idx + 1));
		int twoDigit = Integer.valueOf(ip.substring(idx, idx + 2));
		
		if(oneDigit > 0) {
			solve(ip, idx + 1, curr + arr[oneDigit]);
		}
		
		
		if(twoDigit >= 10 && twoDigit <= 26) {
			solve(ip, idx + 2, curr + arr[twoDigit]);
		}
	
		
		
		
	}

}
