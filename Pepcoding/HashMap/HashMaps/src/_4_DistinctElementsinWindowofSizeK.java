import java.util.*;

public class _4_DistinctElementsinWindowofSizeK {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 5, 6, 3, 2, 3, 2, 4, 5, 2, 2, 2, 2, 3, 6 };
		int k = 4;
		solve(arr, k);
	}

	private static void solve(int[] arr, int k) {
	 
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < k - 1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		for(int j = 0, i = k - 1;  i < arr.length; i++, j++) {
			
			//Acquire
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			
			
			result.add(map.size());
			
			//Release
			if(map.get(arr[j]) == 1) {
				map.remove(arr[j]);
			}else {
				map.put(arr[j], map.get(arr[j]) - 1);
			}
			
		}
		 
		
		System.out.println(result);
	}

}
//[3, 3, 4, 3, 2, 3, 4, 3, 3, 2, 1, 2, 3]
