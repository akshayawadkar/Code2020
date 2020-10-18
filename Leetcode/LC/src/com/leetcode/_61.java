package com.leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class _61 {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;


        ListNode curr = head;
        int cnt = 0;

        while(curr != null){
            cnt++;
            curr = curr.next;
        }

        if(k > cnt){
            k = k % cnt;
        }

        if(k == 0){
            return dummyHead.next;
        }

        int mvs = cnt - k + 1;

        ListNode prev = null;
        curr = dummyHead;

        while(mvs-- > 0){
            prev = curr;
            curr = curr.next;
        }

        ListNode newHead = curr;
        prev.next = null;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = dummyHead.next;




        return newHead;
    }
}