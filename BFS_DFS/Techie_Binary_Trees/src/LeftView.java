
public class LeftView {

	static int idx;

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);

		leftView(root, 0);

	}

	private static void leftView(Node root, int currIdx) {

		if (root != null) {

			if (idx++ <= currIdx) {
				System.out.println(root.key);
			}

			leftView(root.left, currIdx + 1);

			leftView(root.right, currIdx + 1);
		}

	}

}
