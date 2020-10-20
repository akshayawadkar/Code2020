import java.util.Arrays;

public class _15_EqulibriumPoint {
	
	public static void main(String[] args) {
		int[] arr = { 0, -3, 5, -4, -2, 3, 1, 0 };
		solve(arr);
	}

	private static void solve(int[] arr) {
	 
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		
		for(int i = 1; i < arr.length; i++) {
			left[i] = arr[i - 1] + left[i - 1]; 
		}
		
		for(int i = arr.length - 2; i >= 0; i--) {
			right[i] = arr[i + 1] + right[i + 1]; 
		}
		
		
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		
		
		
	}

}
