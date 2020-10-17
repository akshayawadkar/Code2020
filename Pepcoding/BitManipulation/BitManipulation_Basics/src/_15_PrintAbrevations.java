import java.util.Stack;
 

public class _15_PrintAbrevations {

	public static void main(String[] args) {

		String ip = "pep";
		solve(ip);
//		System.out.println(1 << 3);
		
//		System.out.println(check(1, 0));
	}

	private static void solve(String ip) {

		int n = ip.length();
		for (int i = 0; i < (1 << n); i++) {
			StringBuilder sb = new StringBuilder();
			int count = 0;

			for (int j = 0; j < n; j++) {

				if (check(i, (n - j - 1))) {
					count++;
				} else {
					if (count == 0) {
						sb.append(ip.charAt(j));
					} else {
						sb.append(count).append(ip.charAt(j));
						count = 0;
					}
				}

			}
			if(count > 0) {
				sb.append(count);
			}
			System.out.println(sb);
			
		}

	}

	private static boolean check(int num, int k) {
		return (num & (1 << k)) == 0 ? false : true;
	}

}
