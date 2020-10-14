
public class _0016_GetMazePaths {
	
	public static void main(String[] args) {
		
		int m = 3, n = 2;
		
		int numWays = solve(m, n);
		System.out.println(numWays);
	}

	private static int solve(int m, int n) {
		
		if(m < 0 || n < 0) {
			return 0;
		}
		
		if(m == 1 && n == 1) {
			return 1;
		}
		
		
		return solve(m - 1, n) + solve(m, n - 1);
	}

}
