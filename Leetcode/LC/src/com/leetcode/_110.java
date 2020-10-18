package com.leetcode;

public class _110 {

    public boolean isBalanced(TreeNode root) {
        return helper(root) == Integer.MAX_VALUE ? false : true;
    }

    private int helper(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = helper(root.left);

        if(left == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        int right = helper(root.right);

        if(right == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        if(Math.abs(right - left) > 1){
            return Integer.MAX_VALUE;
        }
        return Math.max(right, left) + 1;
    }
}
