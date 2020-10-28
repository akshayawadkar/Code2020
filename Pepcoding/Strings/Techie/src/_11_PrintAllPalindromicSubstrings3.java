import java.util.*;

public class _11_PrintAllPalindromicSubstrings3 {

	public static void main(String[] args) {

		String ip = "google";
		sove(ip);
	}

	private static void sove(String ip) {

		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < ip.length(); i++) {
			adc(ip, i, i, set);
			adc(ip, i, i + 1, set); 
		}
		
		System.out.println(set);

	}

	private static void adc(String ip, int i, int j, Set<String> set) {
		 
		while(i >= 0 && j < ip.length() && ip.charAt(i) == ip.charAt(j)) {
			set.add(ip.substring(i, j + 1));
			i--;
			j++;
		}
		
	}
}
