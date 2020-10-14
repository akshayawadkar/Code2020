import java.util.*;

public class Test {
 
	public static void main(String[] args) {
		
		int num = 3;
		
		List<String> result = solve(3);
		System.out.println(result);
		
		
	}

	private static List<String> solve(int n) {
	 
		if(n == 1) {
			return new ArrayList<>(Arrays.asList("0", "1"));
		}
		
		List<String> recur = solve(n - 1);
		
		List<String> result = new ArrayList<>();
		
		for(int i = 0; i < recur.size(); i++) {
			result.add("0" + recur.get(i));
		}
		
		for(int i = recur.size() - 1; i >= 0; i--) {
			result.add("1" + recur.get(i));
		}
		
		return result;
	}
}