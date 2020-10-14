
public class _0003_ClimbingStairsWithJumps {
	
	
	public static void main(String[] args) {
		
		int[] arr = {3, 3, 0, 2, 2, 3};
		int n = arr.length;
		
		int result = solve(arr, 0, n);
		System.out.println(result);
		
	}

	private static int solve(int[] arr, int idx, int n) {
		
		if(idx > arr.length) {
			return 0;
		}
		
		if(idx == n) {
			return 1;
		}
		
		 
		
		int numWays = 0;
		
		for(int i = 1; i <= arr[idx]; i++) {
			
			numWays += solve(arr, idx + i, n);
			
		}
		
		
		return numWays;
	}

}
