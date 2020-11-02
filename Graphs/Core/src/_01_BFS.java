import java.util.LinkedList;

public class _01_BFS {

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

		public void bfs(int start) {

			boolean[] visited = new boolean[this.v];
			LinkedList<Integer> q = new LinkedList<Integer>();

			q.add(start);
			visited[start] = true;

			while (!q.isEmpty()) {
				int size = q.size();
				for (int i = 0; i < size; i++) {
					Integer curr = q.poll();
					System.out.println(curr);
					for (Integer child : adjMatrix[curr]) {
						if (!visited[child]) {
							q.add(child);
							visited[child] = true;
						}
					}
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

		g.bfs(2);
	}
}
