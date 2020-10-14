
public class _0009_MAXInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,92,-3,43,5};
		int n = arr.length - 1;
		int result = solve(arr, n);
		System.out.println(result);
		 
	}

	private static int solve(int[] arr, int n) {
		
		if(n == -1) {
			return Integer.MAX_VALUE;
		}
		
		
		return Math.min(arr[n], solve(arr, n - 1));
	}

	 

}
