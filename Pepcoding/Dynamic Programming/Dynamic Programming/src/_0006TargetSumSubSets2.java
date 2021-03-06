
public class _0006TargetSumSubSets2 {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 9, 7};
		int sum = 11;
		
		boolean result = solve(arr, sum, arr.length - 1);
		
		System.out.println(result);
		
	}

	private static boolean solve(int[] arr, int sum, int idx) {
	 
		if(sum == 0) {
			return true;
		}
		
		if(sum < 0 || idx < 0) {
			return false;
		}
		
		
		
		if(arr[idx] <= sum) {
			return solve(arr, sum, idx - 1) || solve(arr, sum - arr[idx], idx - 1);
		}else {
			return solve(arr, sum, idx - 1);
		}
		
		 
	}

}
