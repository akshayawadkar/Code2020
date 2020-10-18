package com.leetcode;


import java.util.*;


public class _117 {


    public Node connect(Node root) {
        helper(root);
        return root;


    }

    private void helper(Node root){

        Node dummyHead = new Node(0);
        Node pre = dummyHead;
        while (root != null) {
            if (root.left != null) {
                pre.next = root.left;
                pre = pre.next;
            }
            if (root.right != null) {
                pre.next = root.right;
                pre = pre.next;
            }
            root = root.next;
            if (root == null) {
                pre = dummyHead;
                root = dummyHead.next;
                dummyHead.next = null;
            }
        }
    }
}
