package com.leetcode;

public class _109 {
  
    public TreeNode sortedListToBST(ListNode head) {
        
        return helper(head, null);
    }
    
    private TreeNode helper(ListNode start, ListNode end){
        
        if(start == end){
            return null;
        }
        
        ListNode slow = start;
        ListNode fast = start;
        
        while(fast != end && fast.next != end){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode curr = new TreeNode(slow.val);
        curr.left = helper(start, slow);
        curr.right = helper(slow.next, end); 
        return curr;
    }
}