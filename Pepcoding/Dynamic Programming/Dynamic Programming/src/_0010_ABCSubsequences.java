
public class _0010_ABCSubsequences {
	
	public static void main(String[] args) {
		
		
		String ip = "abcabc";
		
		int result = solve(ip);
		
		System.out.println(result);
		
	}

	private static int solve(String ip) {
		 
		int a = 0, ab = 0, abc = 0;
		
		for(int i = 0; i < ip.length(); i++) {
			
			char ch = ip.charAt(i);
			
			if(ch == 'a') {
				a = 2 * a + 1;
			}else if(ch == 'b') {
				ab = 2 * ab + a;
			}else if(ch == 'c') {
				abc = 2 * abc + ab;
			}
		}
		
		return abc;
	}

}
