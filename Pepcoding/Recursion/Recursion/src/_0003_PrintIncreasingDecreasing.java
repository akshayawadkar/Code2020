
public class _0003_PrintIncreasingDecreasing {

	public static void main(String[] args) {

		int n = 5;
		solve(n);

	}

	private static void solve(int n) {
		 
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		solve(n - 1);
		System.out.println(n);
		
	}
}
