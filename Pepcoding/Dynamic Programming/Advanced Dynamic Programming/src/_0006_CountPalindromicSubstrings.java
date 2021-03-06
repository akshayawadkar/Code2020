
public class _0006_CountPalindromicSubstrings {
	
	
	public static void main(String[] args) {
		
		
		String ip = "abccbc";
		int result = solve(ip);
		System.out.println(result);
		
	}

	private static int solve(String ip) {
		 
		int n = ip.length();
		int result = 0;
		
		boolean[][] dp = new boolean[n][n];
		
		for(int dig = 0; dig < n; dig++) {
			
			for(int i = 0, j = dig; j < n; i++, j++) {
				
				if(dig == 0) {
					dp[i][j] = true;
				}else if(dig == 1) {
					dp[i][j] = ip.charAt(i) == ip.charAt(j);
				}else {
					if(ip.charAt(i) == ip.charAt(j) && dp[i + 1][j - 1]) {
						dp[i][j] = true;
					}
				}
				
				if(dp[i][j] == true) {
					result++;
				}
				
			}
		}
		
		
		
		return result;
	}

}
