
public class _0007_CountBinaryStrings_WithNoConsecutiveZeros {
	
	
	public static void main(String[] args) {
		
		int n = 6;
		
		int result = solve(n);
		
		// Without using extra space
		int result2 = solve2(n);
		
		
		System.out.println(result);
		
		System.out.println(result2);
		
	}

	private static int solve2(int n) {
		 
		int oldZeros = 1;
		int oldOnes = 1;
		
		for(int i = 2; i <= n; i++) {
			int newZeros = oldOnes;
			int newOnes = oldOnes + oldZeros;
			
			oldOnes = newOnes;
			oldZeros = newZeros;
		}
		
		return oldOnes + oldZeros;
	}

	private static int solve(int n) {
		
		int[] zdp = new int[n + 1];
		int[] odp = new int[n + 1];
		
		zdp[1] = 1;
		odp[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			
			zdp[i] = odp[i - 1];
			odp[i] = zdp[i - 1] + odp[i - 1];
		}
		
		

		
		return zdp[n] + odp[n];
	}

}
