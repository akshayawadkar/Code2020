import java.util.Arrays;

public class _0003_LongestBitonicSubsequence {

	public static void main(String[] args) {
		  
//		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80, 3};
		int[] arr = {1, 11, 2, 10, 4, 5, 2, 1};
		int result  = solve(arr);
		System.out.println(result);
		
	}

	private static int solve(int[] arr) {
		 
		int n = arr.length;
		int[] LIS = new int[n];
		Arrays.fill(LIS, 1);
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					LIS[i] = Math.max(LIS[i], LIS[j] + 1);
				}
			}
		}
		
		System.out.println(Arrays.toString(LIS));
		
		
		int[] LDS = new int[n];
		Arrays.fill(LDS, 1);
		
		for(int i = n - 2; i >= 0; i--) {
			for(int j = n - 1; j > i; j--) {
				if(arr[i] > arr[j]) {
					LDS[i] = Math.max(LDS[i], LDS[j] + 1);
				}
			}
		}
		
		System.out.println(Arrays.toString(LDS));
		
		int max = LIS[0] + LDS[0] - 1; 
        for (int i = 1; i < n; i++) 
            if (LIS[i] + LDS[i] - 1 > max) 
                max = LIS[i] + LDS[i] - 1; 
        
        		// - 1 is for repetition
         
  
        return max; 

		 
	}
 

	 
}
