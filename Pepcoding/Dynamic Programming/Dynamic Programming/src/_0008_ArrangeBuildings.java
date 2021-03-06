import java.util.Arrays;

public class _0008_ArrangeBuildings {

	public static void main(String[] args) {

		int n = 5; //169

		int result = solve(n);

		System.out.println(result);

	}

	private static int solve(int n) {

		int[] bdp = new int[n + 1];
		int[] sdp = new int[n + 1];

		bdp[1] = 1;
		sdp[1] = 1;

		for (int i = 2; i <= n; i++) {
			bdp[i] = sdp[i - 1];
			sdp[i] = sdp[i - 1] + bdp[i - 1];
		}

		int lastCell = bdp[n] + sdp[n];

		return lastCell * lastCell;
	}

}
