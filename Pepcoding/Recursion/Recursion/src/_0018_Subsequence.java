
public class _0018_Subsequence {
	 
	public static void main(String[] args) {

		String ip = "abc";
		solve(ip, 0, "");
	 
	}

	private static void solve(String ip, int n, String curr) {
		  
		if(n == ip.length()) {
			System.out.println(curr);
			return;
		}
		
		solve(ip, n + 1, curr + ip.charAt(n));
		solve(ip, n + 1, curr);
		
		
	}
	 

}
