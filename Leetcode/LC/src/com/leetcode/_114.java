package com.leetcode;


import java.util.*;

public class _114 {

    public void flatten(TreeNode root) {

        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){


            if(curr.right != null){
                stack.push(curr.right);
            }


            if(curr.left != null){

                curr.right = curr.left;
                curr.left = null;

            }else{
                if(!stack.isEmpty()){
                    curr.right = stack.pop();
                }

            }

            curr = curr.right;
        }

    }
}
