import java.util.Arrays;
import java.util.LinkedList;

public class _04_SafeRouteWithoutActivatingSensors {

	private static class Node {
		int x;
		int y;

		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
//			this.dist = dist;
		}

	}

	public static void main(String[] args) {

		int[][] arr = { { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

		int result = solve(arr);
		System.out.println(result);
	}

	private static int solve(int[][] arr) {

		int m = arr.length;
		int n = arr[0].length;
		boolean[][] visited = new boolean[m][n];

		System.out.println();

		int[][] dirs8 = { { 1, 0 }, { 0, 1 }, { 1, 1 }, { -1, -1 }, { 0, -1 }, { -1, 0 }, { -1, 1 }, { 1, -1 } };
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0 && !visited[i][j]) {
					for (int[] dir : dirs8) {
						int newX = i + dir[0];
						int newY = j + dir[1];
						if (newX < 0 || newX >= m || newY < 0 || newY >= n) {
							continue;
						}
						arr[newX][newY] = 0;
						visited[newX][newY] = true;
					}
				}
			}
		}

		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}

		LinkedList<Node> q = new LinkedList<_04_SafeRouteWithoutActivatingSensors.Node>();

		for (int i = 0; i < m; i++) {
			if (arr[i][0] == 1) {
				q.add(new Node(i, 0));
				visited[i][0] = true;
			}
		}
		int[][] dirs = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
		int numSteps = 0;
		while (!q.isEmpty()) {
			int size = q.size();

			for (int i = 0; i < size; i++) {
				Node curr = q.poll();

				if (curr.y == n - 1) {
//					System.out.println(numSteps);
					return numSteps;
				}

				for (int[] dir : dirs) {
					int newX = curr.x + dir[0];
					int newY = curr.y + dir[1];

					if (newX < 0 || newX >= m || newY < 0 || newY >= n || visited[newX][newY] || arr[newX][newY] == 0) {
						continue;
					}
					q.add(new Node(newX, newY));
					visited[newX][newY] = true;
				}
			}
			numSteps++;

		}
		return Integer.MAX_VALUE;

	}
}
