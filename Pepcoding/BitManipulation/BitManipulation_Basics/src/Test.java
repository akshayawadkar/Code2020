public class Test {

	public static void main(String[] args) {

		int[] arr = { 197, 130, 1 };

		boolean result = solve(arr);
		System.out.println(result);

	}

	private static boolean solve(int[] arr) {
		
		for(int val : arr) {
			
			if((val >> 7) == 0b0) {
				
			}else if((val >> 5) == 0b110) {
				
			}else if((val >> 4) == 0b1110) {
				
			}else if((val >> 3) == 0b11110) {
				
			}
			
		}
		
		return true;
	}
}