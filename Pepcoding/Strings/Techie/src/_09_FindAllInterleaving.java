import java.util.*;

public class _09_FindAllInterleaving {

	public static void main(String[] args) {

		String x = "ABC";
		String y = "XYZ";

		Set<String> result = new HashSet<>();

		solve("", x, y, result);

		result.forEach((i) -> {
			System.out.println(i);
		});
	}

	private static void solve(String curr, String x, String y, Set<String> result) {
	 
		if(x.length() == 0 && y.length() == 0) {
			result.add(curr);
			return;
		}
		
		if(x.length() > 0) {
			solve(curr + x.charAt(0), x.substring(1), y, result);
		}
		
		if(y.length() > 0) {
			solve(curr + y.charAt(0), x, y.substring(1), result);
		}
		
		
		
		
	}

}
