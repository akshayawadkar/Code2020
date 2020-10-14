import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _06_MinNumberOfDevelopers {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();

		map.put('a', 0);
		map.put('b', 1);
		map.put('c', 2);
		map.put('d', 3);
		map.put('e', 4);

		String[] people = { "ac", "bd", "abcd", "e" };

		int[] peopleMap = new int[people.length];

		for (int i = 0; i < people.length; i++) {
			String currP = people[i];
			for (int j = 0; j < currP.length(); j++) {
				int skill = map.get(currP.charAt(j));
				peopleMap[i] = peopleMap[i] | (1 << skill);
			}
		}

		System.out.println(Arrays.toString(peopleMap));

		solve(peopleMap, map.size(), 0, new ArrayList<Integer>(), 0);
		System.out.println(result);

	}

	static List<Integer> result = new ArrayList<>();

	private static void solve(int[] peopleMap, int nSkills, int curr, ArrayList<Integer> list, int smask) {

		if (curr == peopleMap.length) {
			if (smask == (1 << nSkills) - 1) {
				if (result.size() == 0 || result.size() > list.size()) {
					result = new ArrayList<>(list);
				}
			}
			return;
		}

		solve(peopleMap, nSkills, curr + 1, list, smask);

		list.add(curr);
		solve(peopleMap, nSkills, curr + 1, list, (smask | peopleMap[curr]));
		list.remove(list.size() - 1);

	}

}