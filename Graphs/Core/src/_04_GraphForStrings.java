import java.util.*;

public class _04_GraphForStrings {

	public static void main(String[] args) {

		String[][] edges = { { "Pune", "Nashik" }, { "Pune", "Mumbai" }, { "Mumbai", "Nagpur" },
				{ "Mumbai", "Ahmbdebad" }, { "Nagpur", "Pune" }, { "Nagpur", "Ahmbdebad" } };

		solve(edges);

	}

	private static void solve(String[][] edges) {

		Map<String, List<String>> map = new HashMap<>();

		for (String[] edge : edges) {
			String src = edge[0];
			String dest = edge[1];

			map.putIfAbsent(src, new ArrayList<>());
			map.putIfAbsent(dest, new ArrayList<>());

			map.get(src).add(dest);
		}

//		System.out.println(map);

		dfs(map, "Pune", "Ahxmbdebad");
		 
	}
 

	private static void dfs(Map<String, List<String>> map, String src, String dest) {

		int n = map.size();
		Set<String> visited = new HashSet<>();
		dfs_helper(map, visited, src, dest, new ArrayList<String>());

	}

	private static void dfs_helper(Map<String, List<String>> map, Set<String> visited, String src, String dest,
			ArrayList<String> curr) {

		if (src.equals(dest)) {
			System.out.println(curr);
			return;
		}

		visited.add(src);
		for (String child : map.get(src)) {
			if (!visited.contains(child)) {

				curr.add(child);
				dfs_helper(map, visited, child, dest, curr);
				curr.remove(curr.size() - 1);
			}
		}

	}

}
