import java.util.*;

public class _11_Dijisktras {

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
		int wsf;

		public Pair(int node, String psf, int wsf) {
			super();
			this.node = node;
			this.psf = psf;
			this.wsf = wsf;
		}

	}

	public static void main(String[] args) {
		int[][] edges = { { 0, 3, 40 }, { 0, 1, 10 }, { 1, 2, 10 }, { 2, 3, 10 }, { 3, 4, 3 }, { 4, 5, 3 }, { 5, 6, 3 },
				{ 4, 6, 8 } };

		Map<Integer, List<Edge>> map = new HashMap<>();

		buildGraph(edges, map);
//		System.out.println(map);
		dijisktra(map, 0);
	}

	private static void dijisktra(Map<Integer, List<Edge>> map, int src) {

		PriorityQueue<Pair> pq = new PriorityQueue<_11_Dijisktras.Pair>((a, b) -> {
			return a.wsf - b.wsf;
		});

		int n = map.size();
		boolean[] visited = new boolean[n];

		pq.add(new Pair(0, 0 + "", 0));

		while (!pq.isEmpty()) {

			Pair curr = pq.poll();

			if (visited[curr.node]) {
				continue;
			}

			visited[curr.node] = true;

			System.out.println(src + " to " + curr.node + "  " + curr.wsf + " using path " + curr.psf);

			for (Edge e : map.get(curr.node)) {
				if (!visited[e.dest]) {
					pq.add(new Pair(e.dest, curr.psf + e.dest, curr.wsf + e.wt));
				}
			}
		}

	}

	private static void buildGraph(int[][] edges, Map<Integer, List<Edge>> map) {

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
