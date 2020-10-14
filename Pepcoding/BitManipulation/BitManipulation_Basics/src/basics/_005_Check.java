package basics;

public class _005_Check {

	public static void main(String[] args) {

		String ip = "10110001";

		int num = Integer.parseInt(ip, 2);

		System.out.println(num);
		System.out.println(ip);

		solve(num, 2);

	}

	private static void solve(int num, int k) {

		int msk = 1 << k;

//		System.out.println(Integer.toBinaryString(msk));

		int result = num & (msk);

		System.out.println(result != 0);
	}

}
