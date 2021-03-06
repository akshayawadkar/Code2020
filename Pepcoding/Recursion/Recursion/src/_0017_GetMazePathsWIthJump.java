
public class _0017_GetMazePathsWIthJump {

	public static void main(String[] args) {

		int m = 4, n = 4;

		int numWays = solve(m, n, "");
		System.out.println(numWays);
	}

	private static int solve(int m, int n, String curr) {

		if (m <= 0 || n <= 0) {
			return 0;
		}

		if (m == 1 && n == 1) {
			System.out.println(rev(curr));
			return 1;
		}

		return solve(m - 1, n, curr + "D1 ") 
				+ solve(m - 2, n, curr + "DO2 ") 
				+ solve(m - 3, n, curr + "DO3 ")
				+ solve(m, n - 1, curr + "R1 ") 
				+ solve(m, n - 2, curr + "R2 ") 
				+ solve(m, n - 3, curr + "R3 ")
				+ solve(m - 1, n - 1, curr + "DI1 ") 
				+ solve(m - 2, n - 2, curr + "DI2 ")
				+ solve(m - 3, n - 3, curr + "DI3 ");

	}

	private static String rev(String curr) {

		return new StringBuilder(curr).reverse().toString();
	}

}
