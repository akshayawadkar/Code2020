package _Topic_3_CountSubseq;

public class _TillingDominos2 {

	 public static void main(String[] args) {
		
		 int m = 3, n = 8;
		 
		 int result = solve(m, n);
		 System.out.println(result);
	}

	private static int solve(int m, int n) {
		
		if(n <= 0 || m <= 0) {
			return 0;
		}
		
		if(n < m) {
			return 1;
		}
		
		if(m == n) {
			return 2;
		}
		
		
		return solve(m, n - 1) + solve(m, n - m);
	}

}
