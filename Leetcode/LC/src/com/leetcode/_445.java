package com.leetcode;

import java.util.Stack;

public class _445 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        while(l1 != null){
            stack1.push(l1);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode result = new ListNode(-1);
        ListNode curr = result;

        while(!stack1.isEmpty() || !stack2.isEmpty()){

            int x = !stack1.isEmpty() ? stack1.pop().val : 0;
            int y = !stack2.isEmpty() ? stack2.pop().val : 0;

            int sum = carry + x + y;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        if(carry > 0){
            curr.next = new ListNode(carry);
        }


        return reverse(result.next);
    }

    private static ListNode reverse(ListNode head) {

        ListNode p = head;
        ListNode q = null;

        while(p != null){
            ListNode tmp = p.next;
            p.next = q;
            q = p;
            p = tmp;
        }

        return q;
    }

    public static void main(String[] args) {

        ListNode l1 = ListNode.getList(new int[]{7, 2, 4, 3});
        ListNode l2 = ListNode.getList(new int[]{5, 6, 4});

        ListNode l3 = addTwoNumbers(l1, l2);

        ListNode.display(l3);

    }
}
