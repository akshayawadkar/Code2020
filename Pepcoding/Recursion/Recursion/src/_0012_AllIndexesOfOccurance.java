
public class _0012_AllIndexesOfOccurance {
	
	public static void main(String[] args) {
		
		int[] arr = {3,2,3,4,5,3,2,1};
		int n = arr.length - 1;
		int k = 3;
		int result = solve(arr, n, k);
		System.out.println(result);
		 
	}

	private static int solve(int[] arr, int n, int k) {
		
		if(n == -1) {
			return Integer.MIN_VALUE;
		}
		
		return Math.max(arr[n] == k ? n : Integer.MIN_VALUE, solve(arr, n - 1, k));
		
	}

	 

}
