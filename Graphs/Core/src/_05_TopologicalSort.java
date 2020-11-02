import java.util.LinkedList;
import java.util.Stack;

public class _05_TopologicalSort {

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

		public void topoSort() {
			
			boolean[] visited = new boolean[v];
			Stack<Integer> stack = new Stack<>();
			for(int i = 0; i < v; i++) {
				if(!visited[i]) {
					helper(i, visited, stack);
				}
			}
			
			while(!stack.isEmpty()) {
				System.out.print(stack.pop()+" ");
			}

		}

		private void helper(int curr, boolean[] visited, Stack<Integer> stack) {

			visited[curr] = true;
			
			for(Integer child : adjMatrix[curr]) {
				if(!visited[child]) {
					helper(child, visited, stack);
				}
			}
			stack.push(curr);
		}
	}

	public static void main(String[] args) {

		Graph g = new Graph(6);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);

		g.topoSort();

	}

}
