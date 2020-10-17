
public class _22_PowerOf2 {
	
	
	public static void main(String[] args) {
		
//		System.out.println(1 << 4 );
	
		 
		int num = -2147483648;
		
		boolean check = solve(num);
		System.out.println(check);
		
	}

	private static boolean solve(int num) {
		 
		
		
		return (num & (num - 1)) == 0 ? true : false;
	}

}
