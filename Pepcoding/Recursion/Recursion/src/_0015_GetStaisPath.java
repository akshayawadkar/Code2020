
public class _0015_GetStaisPath {
	
	public static void main(String[] args) {
		
		
		int n = 2;
		
		int result = numWays(n);
		
		System.out.println(result);
		
	}

	private static int numWays(int n) {
		
		if(n < 0) {
			return 0;
		}
		
		if(n == 0) {
			return 1;
		}
		
		return numWays(n - 1) + numWays(n - 2) + numWays(n - 3);
	}

}
