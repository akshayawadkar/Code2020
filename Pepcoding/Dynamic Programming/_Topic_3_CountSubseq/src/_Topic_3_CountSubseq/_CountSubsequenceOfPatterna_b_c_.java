package _Topic_3_CountSubseq;

public class _CountSubsequenceOfPatterna_b_c_ {

	public static void main(String[] args) {
		String ip = "abcabc";
		int numSeq = solve(ip);
		System.out.println(numSeq);

	}

	private static int solve(String ip) {

		int a = 0;
		int ab = 0;
		int abc = 0;

		for (int i = 0; i < ip.length(); i++) {

			if (ip.charAt(i) == 'a') {
				a = 2 * a + 1;
			} else if (ip.charAt(i) == 'b') {
				ab = 2 * ab + a;
			} else if (ip.charAt(i) == 'c') {
				abc = 2 * abc + ab;
			}

		}

		return abc;
	}

}
