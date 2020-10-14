
public class _0002_PrintIncreasing {

	
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
		
	}
}
