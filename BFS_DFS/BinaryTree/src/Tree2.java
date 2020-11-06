
public class Tree2 {
	public static void main(String[] args) {
		Node root = new Node(2);
		root.left = new Node(7);
		root.right = new Node(5);

		root.left.left = new Node(2);
		root.left.right = new Node(6);

		root.right.right = new Node(9);
		
		root.left.right.left = new Node(5);
		root.left.right.right = new Node(11);
		
		

	}
}
