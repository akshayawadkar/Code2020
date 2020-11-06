import java.util.LinkedList;

public class _06_MinPassesReqToConverPositive {

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

		int[][] arr = { { -1, -9, 0, -1, 0 }, { -8, -3, -2, 9, -7 }, { 2, 0, 0, -6, 0 }, { 0, -7, -3, 5, -4 } };

		solve(arr);
	}

	private static void solve(int[][] arr) {

		LinkedList<Node> q = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > 0) {
					q.add(new Node(i, j));
				}
			}

		}

		int numSteps = 0;
		int[][] dirs = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();

				for (int[] dir : dirs) {
					int newX = curr.x + dir[0];
					int newY = curr.y + dir[1];

					if (newX < 0 || newX >= arr.length || newY < 0 || newY >= arr[0].length || arr[newX][newY] >= 0) {
						continue;
					}

					if (arr[newX][newY] < 0) {
						arr[newX][newY] = -arr[newX][newY];
						q.add(new Node(newX, newY));
					}
				}
			}
			numSteps++;
		}

		System.out.println("num " + numSteps);
	}

}
