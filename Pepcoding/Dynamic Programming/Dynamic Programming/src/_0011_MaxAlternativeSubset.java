
public class _0011_MaxAlternativeSubset {
	
	public static void main(String[] args) {
		
		int[] arr = {5, 10, 10, 100, 5}; // 110;
		
		int max = solve(arr);
		System.out.println(max);
		
	}

	private static int solve(int[] arr) {
		
		int n = arr.length;
		int[] inc = new int[n];
		int[] exc = new int[n];
		
		inc[0] = arr[0];
		exc[0] = 0;
		
		for(int i = 1; i < arr.length; i++) {
			inc[i] = exc[i - 1] + arr[i];
			exc[i] = Math.max(exc[i - 1], inc[i - 1]);
		}
		
	
		
		return Math.max(inc[n - 1], exc[n - 1]);
	}

}
