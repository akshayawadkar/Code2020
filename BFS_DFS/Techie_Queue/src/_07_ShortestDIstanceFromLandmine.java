import java.util.Arrays;
import java.util.LinkedList;

public class _07_ShortestDIstanceFromLandmine {

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
		char[][] arr = { { 'O', 'M', 'O', 'O', 'X' }, { 'O', 'X', 'X', 'O', 'M' }, { 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'X', 'X', 'O' }, { 'O', 'O', 'M', 'O', 'O' }, { 'O', 'X', 'X', 'M', 'O' } };
		solve(arr);
	}

	private static void solve(char[][] arr) {

		int m = arr.length;
		int n = arr[0].length;

		int[][] result = new int[m][n];

		LinkedList<Node> q = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 'M') {
					q.add(new Node(i, j));
					result[i][j] = 0;
				} else if (arr[i][j] == 'X') {
					result[i][j] = -1;
				} else {
					result[i][j] = Integer.MAX_VALUE;
				}
			}
		}

		int[][] dirs = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();

				for (int[] dir : dirs) {
					int newX = curr.x + dir[0];
					int newY = curr.y + dir[1];

					if (newX < 0 || newX >= arr.length || newY < 0 || newY >= arr[0].length) {
						continue;
					}

					if (result[newX][newY] == Integer.MAX_VALUE) {
						result[newX][newY] = result[curr.x][curr.y] + 1;
						q.add(new Node(newX, newY));

					}

				}
			}
		}

		for (int[] r : result) {
			System.out.println(Arrays.toString(r));
		}

	}
}
