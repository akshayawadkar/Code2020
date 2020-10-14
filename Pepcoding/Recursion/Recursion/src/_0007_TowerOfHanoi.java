
public class _0007_TowerOfHanoi {

	
	public static void main(String[] args) {
		
		int n = 3;
		
		solve(n, "A", "B", "C ");
		
	}

	private static void solve(int n, String a, String b, String c) {
	 
		if(n == 0) {
			return;
		}
		
		solve(n - 1, a, c, b);
		System.out.println(n + "[" + a + " -> " + b + "]");
		solve(n - 1, c, b, a);
		
	}

	 
}
