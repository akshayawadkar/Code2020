import java.util.LinkedList;

public class _02_DFS {

	private static class Graph {
		int v;
		LinkedList<Integer> adjMatrix[];

		public Graph(int v) {
			this.v = v;
			this.adjMatrix = new LinkedList[v];

			for (int i = 0; i < v; i++) {
				adjMatrix[i] = new LinkedList<Integer>();
			}
		}

		public void addEdge(int src, int dest) {
			adjMatrix[src].add(dest);
		}

		public void dfs(int start) {
			boolean[] visited = new boolean[v];
			dfs_helper(start, visited);
		}

		private void dfs_helper(int curr, boolean[] visited) {
			
			if(visited[curr]) {
				return;
			}
			visited[curr] = true;
			System.out.println(curr);
			
			for(Integer child : adjMatrix[curr]) {
				if(!visited[child]) {
					dfs_helper(child, visited);
				}
			}
			
		}

	}

	public static void main(String[] args) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		g.dfs(2);
	}
}
