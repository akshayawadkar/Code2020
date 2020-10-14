package basics;

public class _002_On {

	
	public static void main(String[] args) {
		
		
		 String ip = "10110101";
		 int num = Integer.valueOf(ip, 2);
		 System.out.println(num); 
		 
		 int k = 3;
		 
		 int result = solve(num, k);
		 System.out.println(ip);
		 System.out.println(Integer.toBinaryString(result));
	}

	private static int solve(int num, int k) {
	 
		int tmp = 1 << k;
		System.out.println(Integer.toBinaryString(tmp));
		
		int x  = num | tmp;
		return x;
	}
}
