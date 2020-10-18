package com.leetcode;

public class _783 {
    Integer prev;
    Integer min;
    public int minDiffInBST(TreeNode root) {
        min = Integer.MAX_VALUE;
        dfs(root);
        return min;
    }

    private void dfs(TreeNode root){
        if(root != null){
            dfs(root.left);
            if(prev != null){
                min = Math.min(min, root.val - prev);
            }
            prev = root.val;
            dfs(root.right);
        }
    }
}
