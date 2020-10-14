package basics;

public class _004_Toogle {

	public static void main(String[] args) {

		String ip = "10100101";

		int num = Integer.parseInt(ip, 2);

		System.out.println(num);
		System.out.println(ip);

		solve(num, 4);

	}

	private static void solve(int num, int k) {

		int msk = 1 << k;

//		System.out.println(Integer.toBinaryString(msk));

		int result = num ^ (msk);

		System.out.println(Integer.toBinaryString(result));
	}
}