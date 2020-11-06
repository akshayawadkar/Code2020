
public class _02_DifferenceBetweenEvenOddLevels {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		int sum = solve(root);
		System.out.println(sum);

	}

	private static int solve(Node root) {
		
		if(root == null) {
			return 0;
		}
		
		return root.val - solve(root.left) - solve(root.right);
	}

//	private static int solve(Node root) {
//		
//		if(root == null) {
//			return 0;
//		}
//		
//		int left = solve(root.left);
//		int right = solve(root.right);
//		
//		
//		return left + right + root.val;
//	}
}
