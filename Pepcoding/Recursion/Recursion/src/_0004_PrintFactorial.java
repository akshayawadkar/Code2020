
public class _0004_PrintFactorial {

	public static void main(String[] args) {

		int n = 5;
		int result = solve(n);
		System.out.println(result);

	}

	private static int solve(int n) {
		 
		if(n == 1) {
			return 1;
		}
		  
		return solve(n - 1) * n;
	}
}
