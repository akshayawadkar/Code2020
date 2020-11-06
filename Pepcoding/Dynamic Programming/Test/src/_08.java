//Count Binary String with no consecutive 0
public class _08 {

	public static void main(String[] args) {

		int n = 6;
		int result = solve2(n);
		System.out.println(result);

	}

	private static int solve2(int n) { 
		
		int odp1 = 1;
		int odp2 = 1;
		
		for(int i = 2; i <= n; i++) {
			int ndp1 = odp2;
			int ndp2 = odp1 + odp2;
			
			odp1 = ndp1;
			odp2 = ndp2;
		}
		
		return odp1 + odp2;
	}

	private static int solve(int n) {

		int[] dp0 = new int[n + 1];
		int[] dp1 = new int[n + 1];

		dp0[1] = 1;
		dp1[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp1[i] = dp1[i - 1] + dp0[i - 1];
			dp0[i] = dp1[i - 1];
		}

		return dp0[n] + dp1[n];
	}

}
