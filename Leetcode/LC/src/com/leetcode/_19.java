package com.leetcode;

public class _19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
       
        
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        
        
        ListNode curr = head;
        
        int cnt = 0;
        while(curr != null){
            cnt++;
            curr = curr.next;
        }
        
        
        int ittr = cnt - n;
        ListNode prev = dummyHead;
        curr = head;
        
        while(ittr > 0){
            prev = curr;
            curr = curr.next;
            ittr--;
        }
        
        // System.out.println(prev.val+" "+curr.val);
        prev.next = curr.next;
        
        return dummyHead.next;
        
    }
}