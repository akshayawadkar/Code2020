import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;

 

public class _15_EqulibriumPoint2 {
	
	public static void main(String[] args) {
		int[] arr = { 0, -3, 5, -4, -2, 3, 1, 0 };
		solve(arr);
	}

	private static void solve(int[] arr) {
	  
		int total = IntStream.of(arr).sum();
		int right = 0;
		
		System.out.println(total);
		List<Integer> result = new ArrayList<>();
		
		for(int i = arr.length- 1; i >= 0; i--) {
			if(right == total - (arr[i] + right)) {
				result.add(i);
			}
			
			right += arr[i];
		}
		
	
		System.out.println(result);
	}

}
