import java.util.*;

public class _13_AllWordsFromedBySameOrderByPattern {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("leet", "abcd", "loot", "geek", "cool", "for", "peer", "dear", "seed",
				"meet", "noon", "otto", "mess", "loss");

		String pattern = "moon";

		solve(words, pattern);
	}

	private static void solve(List<String> words, String pattern) {

		int len = pattern.length();

		for (String word : words) {
			if(isIsomorphic(word, pattern)) {
				System.out.println(word);
			}
		}

	}

	private static boolean isIsomorphic(String s, String t) {

		int[] m1 = new int[256];
		int[] m2 = new int[256];

		int n = s.length();

		for (int i = 0; i < n; i++) {
			int ch1 = s.charAt(i);
			int ch2 = t.charAt(i);

			if (m1[ch1] != m2[ch2]) {
				return false;
			}

			m1[ch1] = i + 1;
			m2[ch2] = i + 1;

		}

//		System.out.println(Arrays.toString(m1));
//		System.out.println(Arrays.toString(m2));

		return true;
	}
}
