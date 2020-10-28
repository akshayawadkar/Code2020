
public class _04_CheckIfStringCanBeDerivedByRotatingThem {

	public static void main(String[] args) {

		String X = "ABCD";
		String Y = "DABC";

		boolean result = solve(X, Y);
		System.out.println(result);
	}

	private static boolean solve(String x, String y) {

		int m = x.length(), n = y.length();
		
		if(m != n) {
			return false;
		}
		
		for(int i = 0; i < m; i++) {
			x = x.substring(1) + x.charAt(0) ;
			if(x.compareTo(y) == 0) {
				return true;
			}
		}
		
		return false;
	}

}
