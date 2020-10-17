import java.util.*;

public class _1_NumberOfEmployeeUnderEveryManager {
	private static void buildGraph(Map<String, String> map, String[][] ip) {

		for (String[] i : ip) {
			String src = i[0];
			String dest = i[1];

			map.put(src, dest);

		}

	}

	public static void main(String[] args) {

		String[][] ip = { { "A", "C" }, { "B", "C" }, { "C", "F" }, { "D", "E" }, { "E", "F" }, { "F", "F" } };
		Map<String, String> map = new HashMap<>();
		buildGraph(map, ip);
		solve(map);
	}

	private static void solve(Map<String, String> employees) {

		Map<String, Set<String>> tree = new HashMap<>();
		String ceo = "";
		for (String employee : employees.keySet()) {
			String manager = employees.get(employee);

			if (employee.equals(manager)) {
				ceo = manager;
			} else {

				if (tree.containsKey(manager)) {
					tree.get(manager).add(employee);
				} else {
					tree.put(manager, new HashSet<>());
					tree.get(manager).add(employee);
				}
			}
		}

		System.out.println(tree);

		Map<String, Integer> result = new HashMap<>();
		dfs(ceo, tree, result);
		System.out.println(result);
	}

	private static int dfs(String manager, Map<String, Set<String>> tree, Map<String, Integer> result) {

		if(!tree.containsKey(manager)) {
			result.put(manager, 0);
			return 1;
		}
		
		int size = 0;

		for(String employee : tree.get(manager)) {
			
			size += dfs(employee, tree, result);
			
		}
		
		result.put(manager, size);

		return size + 1;
	}

}
