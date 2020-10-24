package _Topic_3_CountSubseq;

public class _TillingDominos {

	public static void main(String[] args) {

		int n = 4;

		int count = solve(n);
		System.out.println(count);

	}

	private static int solve(int n) {

		int result = helper(2, n);
		return result;
	}

	private static int helper(int i, int j) {


		if (i <= 0 || j <= 0) {
			return 0;
		}
		
		if (i == 2 && j == 1) {
			return 1;
		}
		if (i == 2 && j == 2) {
			return 2;
		}


		return helper(i, j - 1) + helper(i, j - 2);

	}

}
