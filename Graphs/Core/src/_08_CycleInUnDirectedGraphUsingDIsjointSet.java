import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _08_CycleInUnDirectedGraphUsingDIsjointSet {
	public static void main(String[] args) {

//		int[][] edges = { { 1, 2 }, { 0, 1 }, { 0, 2 }, { 2, 3 } };
		int[][] edges = { { 1, 2 }, { 0, 1 }, { 2, 3 } };

		int n = 4;

		boolean result = detectCycle(edges, n);
		System.out.println(result);

	}

	private static boolean detectCycle(int[][] edges, int n) {

		UnionFind uf = new UnionFind(n);

		for (int[] edge : edges) {
			if (uf.union(edge[0], edge[1]) == false) {
				return true;
			}
		}

		return false;
	}

	private static class UnionFind {
		int[] parent;
		int[] rank;

		public UnionFind(int n) {
			this.parent = new int[n + 1];
			this.rank = new int[n + 1];

			for (int i = 0; i < n + 1; i++) {
				parent[i] = i;
				rank[i] = 1;
			}

		}

		public int find(int n) {
			return n == parent[n] ? n : find(parent[n]);
		}

		public boolean union(int i, int j) {

			int pi = find(i);
			int pj = find(j);

			if (pi == pj) {
				return false;
			}

			if (rank[pi] > rank[pj]) {
				parent[pj] = pi;
			} else if (rank[pi] < rank[pj]) {
				parent[pi] = pj;
			} else {
				parent[pj] = pi;
				rank[pi]++;
			}

			return true;
		}
	}
}
