
public class _0016_PrintMazePaths {
	
	public static void main(String[] args) {
		
		int m = 3, n = 2;
		
		int numWays = solve(m, n, "");
		System.out.println(numWays);
	}

	private static int solve(int m, int n, String curr) {
		
		if(m < 0 || n < 0) {
			return 0;
		}
		
		if(m == 1 && n == 1) {
			System.out.println(rev(curr));
			return 1;
		}
		
		
		return solve(m - 1, n, curr + "D") + solve(m, n - 1, curr + "R");
	}

	private static String rev(String curr) {
		 
		return new StringBuilder(curr)
						.reverse()
						.toString();
	}

}
