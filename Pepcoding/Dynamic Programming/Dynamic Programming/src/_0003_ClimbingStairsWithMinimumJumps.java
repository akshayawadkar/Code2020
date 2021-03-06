
public class _0003_ClimbingStairsWithMinimumJumps {
	
	
	public static void main(String[] args) {
		
//		int[] arr = {3, 3, 1, 2, 2, 3};
		int[] arr = {2,3,1,1,4};
		
		int n = arr.length;
		
		int result = (int) solve(arr, 0);
		System.out.println(result);
		
	}

	private static long solve(int[] arr, int idx) {
		
		if(idx >= arr.length) {
			return Integer.MAX_VALUE;
		}
		 
		
		if(idx == arr.length - 1) {
			return 0;
		}
		
		 
		
		long min = Integer.MAX_VALUE;
		
		for(int i = 1; i <= arr[idx]; i++) {
			
			min = Math.min(min, 1 + solve(arr, idx + i));
			
		}
		
		
		return min;
	}

}
