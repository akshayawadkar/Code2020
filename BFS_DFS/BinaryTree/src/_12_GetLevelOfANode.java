import java.util.LinkedList;

public class _12_GetLevelOfANode {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.right = new Node(9);

		int result = solve(root, 9);
		System.out.println(result);

	}

	private static int solve(Node root, int node) {

		if (root == null) {
			return Integer.MAX_VALUE;
		}

		LinkedList<Node> q = new LinkedList<>();
		q.add(root);

		int level = 1;
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();

				if (curr.val == node) {
//					System.out.println(level);
//					break;
					return level;
				}

				if (curr.left != null) {
					q.add(curr.left);
				}

				if (curr.right != null) {
					q.add(curr.right);
				}

			}
			level++;
		}

		return Integer.MAX_VALUE;
	}

}
