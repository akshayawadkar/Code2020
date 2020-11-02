import java.util.*;

public class _07_CycleInDirectedGraph {

	public static void main(String[] args) {
//		int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 0 }, { 2, 3 }, { 3, 3 } };
		int[][] edges = { { 0, 1 }, { 0, 2 } };

		Map<Integer, List<Integer>> map = new HashMap<>();
		buildGraph(edges, map);

		boolean result = detectCycle(map);
		System.out.println(result);

	}

	private static boolean detectCycle(Map<Integer, List<Integer>> map) {

		int n = map.size();
		boolean[] visited = new boolean[n];
		boolean[] reCurr = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (helper(i, visited, reCurr, map)) {
				return true;
			}
		}

		return false;
	}

	private static boolean helper(int curr, boolean[] visited, boolean[] reCurr, Map<Integer, List<Integer>> map) {

		if (reCurr[curr]) {
			return true;
		}

		if (visited[curr]) {
			return false;
		}

		reCurr[curr] = true;
		visited[curr] = true;

		for (int child : map.get(curr)) {

			if (helper(child, visited, reCurr, map)) {
				return true;
			}

		}

		reCurr[curr] = false;
		return false;
	}

	private static void buildGraph(int[][] edges, Map<Integer, List<Integer>> map) {

		for (int[] edge : edges) {
			int src = edge[0];
			int dest = edge[1];

			map.putIfAbsent(src, new ArrayList<>());
			map.putIfAbsent(dest, new ArrayList<>());

			map.get(src).add(dest);

		}
	}
}
