package com.leetcode;
import java.util.*;
public class _113 {
    /**
     * 
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

        public List<List<Integer>> pathSum(TreeNode root, int sum) {

            if(root == null){
                return new ArrayList<>();
            }

            List<Integer> subList = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();

            sum -= root.val;

            subList.add(root.val);

            dfs(root, sum, subList, result);

            return result;
        }

        public void dfs(TreeNode root, int sum, List<Integer> subList, List<List<Integer>> result){


            if(root.left == null && root.right == null && sum == 0){
                result.add(new ArrayList<>(subList));
                return;
            }

            if(root.left != null){
                subList.add(root.left.val);
                dfs(root.left, sum - root.left.val, subList, result);
                subList.remove(subList.size() - 1);
            }

            if(root.right != null){
                subList.add(root.right.val);
                dfs(root.right, sum - root.right.val, subList, result);
                subList.remove(subList.size() - 1);
            }

        }

}
