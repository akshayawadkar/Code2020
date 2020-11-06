
public class _06_PrintNodesOnGivenLevel {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		solve(root, 3);

	}

	private static void solve(Node root, int level) {

		if (root == null) {
			return;
		}

		if (level == 1) {
			System.out.print(root.val+" ");
			return;
		}

		solve(root.left, level - 1);
		solve(root.right, level - 1);

	}

}
