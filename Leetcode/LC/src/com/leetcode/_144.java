package com.leetcode;

import java.util.*;

public class _144 {
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }

        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(curr);

        List<Integer> result = new ArrayList<>();

        while(!stack.isEmpty()){

            curr = stack.pop();
            result.add(curr.val);

            if(curr.right != null){
                stack.push(curr.right);
            }

            if(curr.left != null){
                stack.push(curr.left);
            }

        }

        return result;
    }
}
