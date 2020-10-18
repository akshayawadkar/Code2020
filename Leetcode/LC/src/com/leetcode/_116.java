package com.leetcode;
import java.util.*;
import java.util.*;


public class _116 {


    public Node connect(Node root) {

        if(root == null){
            return root;
        }

        root.next = null;

        dfs(root);

        return root;
    }

    private void dfs(Node root){

        if(root != null){

            if(root.left != null){
                root.left.next = root.right;
            }

            if(root.right != null){
                root.right.next = root.next == null ? null : root.next.left;
            }

            dfs(root.left);
            dfs(root.right);
        }

    }
}
