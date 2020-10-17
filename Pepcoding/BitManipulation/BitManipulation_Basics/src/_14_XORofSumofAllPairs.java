public class _14_XORofSumofAllPairs{
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int totalSumofPairs = solve(arr);
		System.out.println(totalSumofPairs);
		
	}

	private static int solve(int[] arr) {
		
		int xor = 0;
		for(int i : arr) {
			xor = xor ^ (2 * i);
		}
		return xor;
	}
}