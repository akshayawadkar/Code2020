package com.leetcode;
import java.util.*;
public class _21 {
    public com.company.ListNode mergeTwoLists(com.company.ListNode l1, com.company.ListNode l2) {
        
        com.company.ListNode result = new com.company.ListNode(-1);
        com.company.ListNode curr = result;
        
        while(l1 != null && l2 != null){
            
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        
        curr.next = l1 != null ? l1 : l2;
        
        return result.next;
    }
}