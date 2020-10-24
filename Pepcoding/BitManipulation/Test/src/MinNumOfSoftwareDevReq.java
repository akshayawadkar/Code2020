import java.util.*;

public class MinNumOfSoftwareDevReq {

	static List<Integer> sol = new ArrayList<>();

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();

		map.put('a', 0);
		map.put('b', 1);
		map.put('c', 2);
		map.put('d', 3);
		map.put('e', 4);

		String[] people = { "ac", "bd", "abcd", "e" };

		int[] skillMap = new int[people.length];

		for (int i = 0; i < people.length; i++) {
			for (int j = 0; j < people[i].length(); j++) {
				char ch = people[i].charAt(j);

				int mask = 1 << map.get(ch);
				skillMap[i] += mask;
			}
		}

		System.out.println(Arrays.toString(skillMap));
		int n = map.size();
		// get all subsequences and find the smallest of them
		List<Integer> subList = new ArrayList<>();
		dfs(skillMap, n, 0, new ArrayList<>(), 0);

		System.out.println(sol);

	}

	private static void dfs(int[] people, int nskills, int cp, List<Integer> onesol, int smask) {

		if (cp == people.length) {
			if (smask == ((1 << nskills) - 1)) {
				if (sol.size() == 0 || sol.size() > onesol.size()) {
					sol = new ArrayList<>(onesol);
					return;
				}
				return;
			}
			return;
		}

		dfs(people, nskills, cp + 1, onesol, smask);

		onesol.add(cp);
		dfs(people, nskills, cp + 1, onesol, (smask | people[cp]));
		onesol.remove(onesol.size() - 1);

	}

}
