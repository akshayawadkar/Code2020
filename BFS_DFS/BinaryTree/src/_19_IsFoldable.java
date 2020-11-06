import java.util.LinkedList;

public class _19_IsFoldable {

	public static void main(String[] args) {
		Node root = new Node(2);
		root.left = new Node(7);
		root.right = new Node(8);
		root.left.left = new Node(5);
		root.right.right = new Node(5); 
		
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		root2.left.right = new Node(5); 
		
		
		
		
		System.out.println(isSameTree(root.left, root.right));
		System.out.println(isSameTree(root2.left, root2.right));
		
		 

	}
	
	public static boolean isSameTree(Node p, Node q) {
        if(p == null && q == null){
            return true;
        }
        
        if(p == null || q == null){
            return false;
        }
        
       
        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }

	 

}
