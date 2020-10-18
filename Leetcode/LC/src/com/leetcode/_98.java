package com.leetcode;

public class _98 {

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer left, Integer right){
        if(root == null){
            return true;
        }

        if(left != null && root.val <= left){
            return false;
        }

        if(right != null && root.val >= right){
            return false;
        }

        if(!helper(root.left, left, root.val)){
            return false;
        }

        if(!helper(root.right, root.val, right)){
            return false;
        }

        return true;
    }
}
