import java.util.*;
import java.util.Map.Entry;

public class _13_TopView {

	public static void main(String[] args) {
		Node root = new Node(2);
		root.left = new Node(7);
		root.right = new Node(5);

		root.left.left = new Node(2);
		root.left.right = new Node(6);

		root.right.right = new Node(9);

		root.left.right.left = new Node(5);
		root.left.right.right = new Node(11);
		
		root.right.right.left = new Node(4);

		solve(root);

	}

	private static void solve(Node root) {

		Map<Integer, List<Integer>> map = new TreeMap<>();
		helper(root, map, 0);

		for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
			System.out.println(e.getValue().get(e.getValue().size() - 1));
//			System.out.println(e.getValue());
		}

	}

	private static void helper(Node root, Map<Integer, List<Integer>> map, int idx) {

		if (root != null) {
			map.putIfAbsent(idx, new ArrayList<>());
			map.get(idx).add(root.val);

			helper(root.left, map, idx - 1);

			helper(root.right, map, idx + 1);

		}

	}

}