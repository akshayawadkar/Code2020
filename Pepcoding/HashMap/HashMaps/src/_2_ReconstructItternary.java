import java.util.*;

public class _2_ReconstructItternary {

	public static void main(String[] args) {

		String[][] tickets = { { "Chennai", "Banglore" }, { "Bombay", "Delhi" }, { "Goa", "Chennai" },
				{ "Delhi", "Goa" } };

		solve(tickets);

	}

	private static void solve(String[][] tickets) {

		Map<String, Boolean> rootMap = new HashMap<>();
		Map<String, List<String>> map = new HashMap<>();

		for (String[] ticket : tickets) {
			String src = ticket[0];
			String dest = ticket[1];

			rootMap.put(src, true);
			rootMap.put(dest, false);

			map.putIfAbsent(src, new ArrayList<>());
			map.putIfAbsent(dest, new ArrayList<>());

			map.get(src).add(dest);

		}

		String root = "";
		for (String city : rootMap.keySet()) {
			if (rootMap.get(city)) {
				root = city;
			}
		}

		System.out.println(root);
		System.out.println(map);
		List<String> result = new ArrayList<>();
		dfs(root, map, result);
		System.out.println(result);
	}

	private static void dfs(String root, Map<String, List<String>> map, List<String> result) {

		if (map.get(root).isEmpty()) {
			System.out.println("here");
			result.add(root);
			return;
		}

		for (String city : map.get(root)) {
			result.add(root);
			dfs(city, map, result);
		}

	}

}
