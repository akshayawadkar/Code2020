import com.util.Subarray;
import java.util.*;

public class _07_FindMaxLenSubarrayWithEqual01 {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 1, 0, 0, 0, 1,1,1,0,0,0 };

		solve(arr);

	}

	private static void solve(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		
		Subarray result = new Subarray(-1, -1);
		
		int sum = 0;
		int len = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] == 0 ? -1 : 1;

			if (map.containsKey(sum)) {
				if(len < (i - map.get(sum))) {
					len =  i - map.get(sum);
					result.x = map.get(sum) + 1;
					result.y = i;
				}
				len = Math.max(len, i - map.get(sum));
			}

			map.putIfAbsent(sum, i);
		}
		System.out.println(result);
		
		System.out.println("length is " + len);
	}

}
