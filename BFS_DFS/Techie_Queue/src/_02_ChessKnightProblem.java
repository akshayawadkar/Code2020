import java.util.LinkedList;

public class _02_ChessKnightProblem {
	private static class Node {
		int x;
		int y;

		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {

		int N = 8;

		Node src = new Node(0, 7);
		Node dest = new Node(7, 0);

		solve(N, src, dest);

	}

	private static void solve(int n, Node src, Node dest) {

		int rows = n;
		int cols = n;

		LinkedList<Node> q = new LinkedList<_02_ChessKnightProblem.Node>();
		q.add(new Node(src.x, src.y));

		int[][] dirs = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };
		boolean[][] visited = new boolean[n][n];

		int numSteps = 0;

		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();
				if (curr.x == dest.x && curr.y == dest.y) {

					System.out.println("here " + numSteps);
					break;
				}

				for (int[] dir : dirs) {
					int newX = dir[0] + curr.x;
					int newY = dir[1] + curr.y;

					if (newX < 0 || newX >= rows || newY < 0 || newY >= cols || visited[newX][newY]) {
						continue;
					}

					visited[newX][newY] = true;
					q.add(new Node(newX, newY));

				}

			}
			numSteps++;
		}

	}

}
