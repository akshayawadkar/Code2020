package basics;

public class _003_Off {

	public static void main(String[] args) {

		String ip = "10110101";

		int num = Integer.parseInt(ip, 2);

		System.out.println(num);
		System.out.println(ip);

		solve(num, 4);

	}

	private static void solve(int num, int k) {
	  
		int msk  = 1 << k;
		
//		System.out.println(Integer.toBinaryString(msk));
		
		int result = num & (~msk);
		
		System.out.println(Integer.toBinaryString(result));
	}
}
