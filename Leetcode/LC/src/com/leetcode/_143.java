package com.leetcode;
public class _143 {
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
    class Solution {
        public void reorderList(ListNode head) {

            if(head == null || head.next == null){
                return ;
            }

            ListNode prev = null;
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }


            ListNode rev = reverse(slow.next);
            slow.next = null;

            ListNode dummyHead = new ListNode(-1);
            ListNode curr = dummyHead;
            boolean flag = true;

            while(head != null && rev != null){
                if(flag){
                    flag = false;
                    curr.next = head;
                    head = head.next;
                }else{
                    flag = true;
                    curr.next = rev;
                    rev = rev.next;
                }
                curr = curr.next;
            }
            curr.next = head != null ? head : rev;
            head = dummyHead.next;
        }

        private ListNode reverse(ListNode head){

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
}
