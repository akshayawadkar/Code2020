
public class _08_ReverseLevelOrderTraversal_Recursive {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		int height = getHeight(root);

		solve(root, height);

	}

	private static void solve(Node root, int height) {
		if (root == null) {
			return;
		}

		for (int i = height; i >= 1; i--) {
			printOnGivenLevel(root, i);
			System.out.println();
		}

	}
	
	private static void printOnGivenLevel(Node root, int level) {

		if (root == null) {
			return;
		}

		if (level == 1) {
			System.out.print(root.val+" ");
			return;
		}

		printOnGivenLevel(root.left, level - 1);
		printOnGivenLevel(root.right, level - 1);

	}

	private static int getHeight(Node root) {

		if (root == null) {
			return 0;
		}

		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

}
