import java.util.*;

public class _09_Prims {

	private static class Edge {
		int src;
		int dest;
		int wt;

		public Edge(int src, int dest, int wt) {
			super();
			this.src = src;
			this.dest = dest;
			this.wt = wt;
		}
	}

	private static class Pair {

		int node;
		String psf;
		int nodeWt;

		public Pair(int node, String psf, int nodeWt) {
			super();
			this.node = node;
			this.psf = psf;
			this.nodeWt = nodeWt;
		}

	}

	public static void main(String[] args) {
//		int[][] edges = { { 0, 3, 40 }, { 0, 1, 10 }, { 1, 2, 10 }, { 2, 3, 10 }, { 3, 4, 3 }, { 4, 5, 3 }, { 5, 6, 3 },
//				{ 4, 6, 8 } };

		int[][] edges = { { 0, 1, 10 }, { 0, 2, 5 }, { 0, 3, 8 }, { 1, 3, 20 }, { 2, 3, 30 } };

		Map<Integer, List<Edge>> map = new HashMap<>();
		buildGraph(map, edges);

		prims(map);

	}

	private static void prims(Map<Integer, List<Edge>> map) {

		int n = map.size();
		boolean[] visited = new boolean[n];
		List<Integer> result = new ArrayList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
			return a.nodeWt - b.nodeWt;
		});
		pq.add(new Pair(0, 0 + " ", -1));

		while (!pq.isEmpty()) {

			Pair curr = pq.poll();

			if (visited[curr.node]) {
				continue;
			}

			visited[curr.node] = true;
			result.add(curr.node);
//			System.out.println();

			for (Edge child : map.get(curr.node)) {
				if (!visited[child.dest]) {
					pq.add(new Pair(child.dest, curr.psf + " " + child.dest, child.wt));
				}
			}

		}

		System.out.println(result);

	}

	private static void buildGraph(Map<Integer, List<Edge>> map, int[][] edges) {

		for (int[] edge : edges) {
			int src = edge[0];
			int dest = edge[1];
			int wt = edge[2];
			map.putIfAbsent(src, new ArrayList<>());
			map.putIfAbsent(dest, new ArrayList<>());
			map.get(src).add(new Edge(src, dest, wt));
		}

	}

}
