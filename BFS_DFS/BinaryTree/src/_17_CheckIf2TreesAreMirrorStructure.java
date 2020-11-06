import java.util.LinkedList;

public class _17_CheckIf2TreesAreMirrorStructure {

	public static void main(String[] args) {
		Node root = new Node(2);
		root.left = new Node(7);
		root.right = new Node(8);
		root.left.left = new Node(5);
		
		
		Node root2 = new Node(12);
		root2.left = new Node(27);
		root2.right = new Node(28);
		root2.left.left = new Node(15);
		
		
		System.out.println(isSameTree(root, root2));
		 

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
