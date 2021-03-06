
public class _0005_Pow {

	public static void main(String[] args) {

		int a = 2, b = 4;
		int result = pow(a, b);
		System.out.println(result);
	}

	private static int pow(int a, int b) {
	 
		 if(b < 0) {
			 return 1 / recuPow(a, b);
		 }
		 
		 return recuPow(a, b);
	}

	private static int recuPow(int a, int b) {
		
		if(b == 0) {
			return 1;
		}
		
		return recuPow(a, b - 1) * a;
	}

	 
}
