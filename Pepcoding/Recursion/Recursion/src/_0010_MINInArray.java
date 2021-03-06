
public class _0010_MINInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,92,3,43,5};
		int n = arr.length - 1;
		int result = solve(arr, n);
		System.out.println(result);
		 
	}

	private static int solve(int[] arr, int n) {
		
		if(n == -1) {
			return Integer.MIN_VALUE;
		}
		
		
		return Math.max(arr[n], solve(arr, n - 1));
	}

	 

}
