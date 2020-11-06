import java.util.LinkedList;

public class _14_PrintBoundary {

	public static void main(String[] args) {

		Node root = new Node(2);
		root.left = new Node(7);
		root.right = new Node(15);

		root.left.left = new Node(3);
		root.left.right = new Node(8);

		root.right.right = new Node(20);

		root.left.right.left = new Node(5);
		root.left.right.right = new Node(10);
		root.right.right.right = new Node(25);

		solve(root);
//		printLevelOrder(root);

	}

	private static void solve(Node root) {

	}

}
