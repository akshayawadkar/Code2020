package com.leetcode;

public class _23 {
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0){
            return null;
        }
        
        ListNode result = null;
        
        for(int i = 0; i < lists.length; i++){
            
            result = mergeTwoLists(result, lists[i]);
            
        }
        return result;
    }
    
    private ListNode mergeTwoLists(ListNode l1, ListNode l2){
        
        
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        
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
        
        return dummyHead.next;
    }
}