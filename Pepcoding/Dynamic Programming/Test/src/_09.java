
public class _09 {

	public static void main(String[] args) {

		String ip = "abcabc";
		int result = solve(ip);
		System.out.println(result);

	}

	private static int solve(String ip) {
		
		int a = 0;
		int ab = 0;
		int abc = 0;
		
		for(int i = 0; i < ip.length(); i++) {
			if(ip.charAt(i) == 'a') {
				a = (2 * a) + 1;
			}else if(ip.charAt(i) == 'b') {
				ab = (2 * ab) + a;
			}else if(ip.charAt(i) == 'c') {
				abc = (2 * abc) + ab;
			}
		}
		
		return abc;
	}

}
