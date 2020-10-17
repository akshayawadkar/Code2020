import java.util.HashMap;
import java.util.Map;

public class _6_SubArraySumEqualsK {
    public int subarraySum(int[] arr, int k) {
        int sum = 0;
        int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}

			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		
		System.out.println(count);
        return count;
    }
}