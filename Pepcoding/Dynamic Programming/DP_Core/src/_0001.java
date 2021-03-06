
public class _0001 {
	
	public static void main(String[] args) {
		
		int[] values = {60, 100 ,120};
		int[] weights = {10, 20 ,30};
		int W = 50;
		int n = values.length;
		int maxProfit = solve(weights, values, W, n);
		System.out.println(maxProfit);
		
	}

	private static int solve(int[] weights, int[] values, int W, int n) {
		 
		
		if(n == 0 || W == 0) {
			return 0;
		}
		
		if(weights[n - 1] <= W) {
			return Math.max(solve(weights, values, W, n - 1),
					 		values[n - 1] + solve(weights, values, W - weights[n - 1], n - 1));
		}else {
			return solve(weights, values, W, n - 1);
		} 
	}

}
