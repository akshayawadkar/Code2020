import java.util.LinkedList;

public class _16_PrintNodesBetweenLevels {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);

		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);

		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);

		root.right.right.left = new Node(14);
		root.right.right.right = new Node(15);

		solve(root, 2, 3);

	}

	private static void solve(Node root, int start, int end) {

		LinkedList<Node> q = new LinkedList<Node>();

		q.add(root);
		int level = 1;

		while (!q.isEmpty()) {
			int size = q.size();

			for (int i = 0; i < size; i++) {
				Node curr = q.poll();

				if(level >= start && level <= end) {
					System.out.print(curr.val+" ");
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

	}

}
