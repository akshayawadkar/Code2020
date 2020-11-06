import java.util.Stack;

public class _15_SprialOrder {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		solve(root);
	}

	private static void solve(Node root) {

		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();

		stack1.push(root);

		while (!stack1.isEmpty() || !stack2.isEmpty()) {

			while (!stack1.isEmpty()) {
				Node curr = stack1.pop();
				System.out.print(curr.val);
				if (curr.left != null) {
					stack2.push(curr.left);
				}
				if (curr.right != null) {
					stack2.push(curr.right);
				}

			}

			System.out.println();

			while (!stack2.isEmpty()) {

				Node curr = stack2.pop();
				System.out.print(curr.val);
				if (curr.right != null) {
					stack1.push(curr.right);
				}
				if (curr.left != null) {
					stack1.push(curr.left);
				}

			}
			
			System.out.println();

		}

	}
}
