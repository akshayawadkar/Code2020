import com.util.Subarray;
import java.util.*;

public class _06_FindMaxLenSubarrayWithGivenSum {

	public static void main(String[] args) {

		int[] arr = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int sum = 8;

		solve(arr, sum);

	}

	private static void solve(int[] arr, int k) {

		Subarray result = new Subarray(-1, -1);
		int len = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);

		int sum = 0;

		for (int right = 0; right < arr.length; right++) {
			sum += arr[right];
			
			if(map.containsKey(sum - k)) {
				if(len < (right - map.get(sum - k))) {
					len = right - map.get(sum - k);
					result.x = map.get(sum - k) + 1;
					result.y = right;
				}
			}
				
			map.putIfAbsent(sum, right);
		}

		System.out.println(result +" of length "+len);
		
	}

}
