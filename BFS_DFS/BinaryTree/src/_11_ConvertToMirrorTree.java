import java.util.LinkedList;

public class _11_ConvertToMirrorTree {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		solve(root);
		printLevelOrder(root);

	}

	private static void solve(Node root) {
		
		if(root == null) {
			return;
		}
		
		 
		
		Node tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
		solve(root.left);
		solve(root.right);
		
		 
	}

	private static void printLevelOrder(Node root) {

		LinkedList<Node> q = new LinkedList<Node>();

		q.add(root);

		while (!q.isEmpty()) {
			int size = q.size();

			for (int i = 0; i < size; i++) {
				Node curr = q.poll();

				System.out.print(curr.val + " ");
				if (curr.left != null) {
					q.add(curr.left);
				}

				if (curr.right != null) {
					q.add(curr.right);
				}
			}
			System.out.println();
		}
	}
}
