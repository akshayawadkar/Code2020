
public class _06_UnionFind {

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

	public static void main(String[] args) {

		UnionFind uf = new UnionFind(7);

		uf.union(1, 2);
		uf.union(2, 3);
		uf.union(4, 5);
		uf.union(6, 7);
		uf.union(5, 6);
		uf.union(3, 7);

		System.out.println(uf.find(1));
		System.out.println(uf.find(2));
		System.out.println(uf.find(3));
		System.out.println(uf.find(4));
		System.out.println(uf.find(5));
		System.out.println(uf.find(6));
		System.out.println(uf.find(7));

	}
}
