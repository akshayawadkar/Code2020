import java.util.ArrayList;
import java.util.*;
import java.util.Map;

public class _07_NumberOfValidWordsInAPuzzle {

	public static void main(String[] args) {

		String[] words = { "aaaa", "asas", "able", "ability", "actt", "actor", "access" };

		String[] puzzles = { "aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz" };
//		Output: [1,1,3,2,4,0]
		
		List<Integer> result = solve(words, puzzles);
		System.out.println(result);
	}

	private static List<Integer> solve(String[] words, String[] puzzles) {
	 
		Map<Character, ArrayList<Integer>> map = new HashMap<>();
		
//		for(char ch = 'a'; ch <= 'z'; ch++) {
//			map.put(ch, new ArrayList<>());
//		}
		
		for(int i = 0; i < 26; i++) {
			map.put((char) ('a' + i), new ArrayList<>());
		}
		
		for(String word : words) {
			int mask = 0;
			for(char ch : word.toCharArray()) {
				int bit = ch - 'a';
				mask = mask | ((1 << bit));
			}
			HashSet<Character> unique = new HashSet<>();
			
			for(char ch : word.toCharArray()) {
				if(unique.contains(ch)) {
					continue;
				}
				map.get(ch).add(mask);
				unique.add(ch);
			}
		}
		List<Integer> result = new ArrayList<>();
		for(String puzzle : puzzles) {
			int pmask = 0;
			for(char ch : puzzle.toCharArray()) {
				int bit = ch - 'a';
				pmask = pmask | ((1 << bit));
			}
			
			char fch = puzzle.charAt(0);
			
			ArrayList<Integer> wordsToCheck = map.get(fch);
			int count = 0;
			for(int wmask : wordsToCheck) {
				if((wmask & pmask) == wmask) {
					count++;
				}
			}
			result.add(count);
		}
		
		
		
		return result;
	}

}
