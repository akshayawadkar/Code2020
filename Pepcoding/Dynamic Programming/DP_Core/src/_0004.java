
public class _0004 {

	public static void main(String[] args) {

		int[] arr = { 3, 34, 4, 12, 5, 2 };

		int sum = 30;
		int n = arr.length;
		boolean result = solve(arr, sum, n);
		System.out.println(result);

	}

	private static boolean solve(int[] arr, int sum, int n) {

		if (sum == 0) {
			return true;
		}
		
		if(n <= 0 || sum < 0) {
			return false;
		}
		
		if(arr[n - 1] <= sum ) {
			return	solve(arr, sum, n - 1) || solve(arr, sum - arr[n - 1], n - 1); 
		}else {
			return solve(arr, sum, n - 1);
		}
	}
}
