
public class _21_MaxSubarrayMulti {
	public static void main(String[] args) {

		int[] arr = { -6, 4, -5, 8, -10, 0, 8 };
		int maxMul = solve(arr);
		int maxMul2 = solve2(arr);

		System.out.println(maxMul2);

	}

	private static int solve2(int[] arr) {
	

		int currentMax = arr[0];
		int currentMin = arr[0];
		int result = arr[0];
		
		
		for(int i  = 1; i < arr.length; i++) {
			
			int tmp = currentMax;
			
			currentMax = Math.max(Math.max(currentMax * arr[i],  currentMin * arr[i]), arr[i]);
			currentMin = Math.min(Math.min(tmp * arr[i],  currentMin * arr[i]), arr[i]);
			
			
			
			if(currentMax > result) {
				result = currentMax;
			}
			 
		}
		
		
		return result;
	}

	private static int solve(int[] arr) {

		int maxMul = 0;
		int mul = 1;

		for (int i = 0; i < arr.length; i++) {
			mul = mul * arr[i];
			maxMul = Math.max(maxMul, mul);
			if (mul == 0) {
				mul = 1;
			}
		}

		mul = 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			mul = mul * arr[i];
			maxMul = Math.max(maxMul, mul);
			if (mul == 0) {
				mul = 1;
			}
		}

		return maxMul;
	}

}
