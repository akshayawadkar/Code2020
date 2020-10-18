package com.leetcode;

public class _108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        
        return helper(nums, 0, nums.length - 1);
        
    }
    
    private TreeNode helper(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        
        int mid = start + (end - start) / 2;
        
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = helper(nums, start, mid - 1);
        curr.right = helper(nums, mid + 1, end);
        return curr;
    }
    
}