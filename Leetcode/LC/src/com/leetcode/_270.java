package com.leetcode;

public class _270 {

    double[] result = new double[2];
    public int closestValue(TreeNode root, double target) {
        result[0] = Double.MAX_VALUE;
        dfs(root, target);
        return (int)result[1];
    }

    private void dfs(TreeNode root, double target){

        if(root != null){

            if(Math.abs(root.val - target) < result[0]){
                result[0] = Math.abs(root.val - target);
                result[1] = root.val;
            }

            if(root.val > target){
                dfs(root.left, target);
            }else {
                dfs(root.right, target);
            }
        }
    }
}
