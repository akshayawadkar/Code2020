package _Topic_3_CountSubseq;

public class Test {
	
	public static void main(String[] args) {
		
		int n = 3;
		
		int result = solve(n);
		System.out.println(result);
		
		
		
	}

	private static int solve(int n) {
		
		if(n < 0) {
			return 0;
		}
		
		if(n == 0) {
			return 1;
		}
		
		return solve(n - 1) + solve(n - 2);
	}

}
