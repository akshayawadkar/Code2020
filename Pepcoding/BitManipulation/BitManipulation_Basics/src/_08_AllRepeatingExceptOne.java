
public class _08_AllRepeatingExceptOne {

	
	public static void main(String[] args) {
		
		int[] arr = {1,2,1,2,3,4,4};
		
		int result = 0;
		for(int i : arr) {
			result = result ^ i;
		}
		
		System.out.println(result);
		
	}
}
