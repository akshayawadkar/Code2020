package com.leetcode;

import com.leetcode.ListNode;

public class _206 {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null){
            
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp; 
        }
        
        return prev;
    }
}