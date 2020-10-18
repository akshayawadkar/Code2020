package com.leetcode;

public class ListNode {

    int val;
    ListNode next;

    ListNode(){

    }

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public static ListNode getList(int[] arr) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;

        for(int i : arr){
            curr.next = new ListNode(i);
            curr = curr.next;
        }

        return head.next;
    }

    public static void display(ListNode head){

        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }

    }





}
