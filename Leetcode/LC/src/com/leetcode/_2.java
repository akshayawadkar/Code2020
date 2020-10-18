package com.leetcode;

public class _2 {
    private static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(-1);
        ListNode curr = result;

        int carry = 0;
        while(l1 != null || l2 != null){

            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }

        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return result.next;
    }

    public static void main(String[] args) {

        ListNode l1 = getListNode(new int[]{2,4,3});
        ListNode l2 = getListNode(new int[]{5,6,4});
        ListNode result = addTwoNumbers(l1, l2);
        print(result);

    }
    private static void print(ListNode head){
        while(head != null){
            System.out.println(head.val+" ");
            head = head.next;
        }
    }

    private static ListNode getListNode(int[] ints) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        for(int i : ints){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return head.next;
    }

}
