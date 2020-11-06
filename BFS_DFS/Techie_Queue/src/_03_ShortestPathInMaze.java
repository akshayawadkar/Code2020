import java.util.LinkedList;

public class _03_ShortestPathInMaze {

	private static class Node {
		int x;
		int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 }, { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 }, { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 }, { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 }, { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 }, };

		Node src = new Node(0, 0);
		Node dest = new Node(7, 5);

		solve(arr, src, dest);

	}

	private static void solve(int[][] arr, Node src, Node dest) {

		int min = Integer.MAX_VALUE;
		LinkedList<Node> q = new LinkedList<>();
		int[][] dirs = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
		q.add(src);
		int numSteps = 0;
//		boolean[][] visited = new boolean[arr.length][arr[0].length];

		while (!q.isEmpty()) {

			int size = q.size();
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();

				if (curr.x == dest.x && curr.y == dest.y) {
					System.out.println("Num Steps " + numSteps);
					break;
				}

				for (int[] dir : dirs) {
					int newX = curr.x + dir[0];
					int newY = curr.y + dir[1];

					if (newX < 0 || newX >= arr.length || newY < 0 || newY >= arr[0].length || arr[newX][newY] == 0) {
						continue;
					}

//					visited[newX][newY] = true;
					arr[newX][newY] = 0;
					q.add(new Node(newX, newY));

				}

			}
			numSteps++;
		}

		System.out.println(min);

	}

}
