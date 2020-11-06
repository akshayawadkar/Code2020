import java.util.LinkedList;

public class _01_PrintNodesBewteenGivenLevel {

	private static class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			super();
			this.val = val;
			this.left = null;
			this.right = null;
		}

	}

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		root.left.left.left = new Node(8);
		root.left.right.right = new Node(9);

		root.right.left.left = new Node(10);
		root.right.right.right = new Node(11);

		printNodes(root, 2, 3);
	}

	private static void printNodes(Node root, int start, int end) {

		LinkedList<Node> q = new LinkedList<_01_PrintNodesBewteenGivenLevel.Node>();

		q.add(root);
		int level = 0;

		while (!q.isEmpty()) {
			int size = q.size();
			level++;
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();
				if (level >= start && level <= end) {
					System.out.print(curr.val + " ");
				}

				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			}
		}

	}

}
