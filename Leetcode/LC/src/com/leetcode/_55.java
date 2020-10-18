package com.leetcode;

public class _55 {
    public boolean canJump(int[] nums) {
        
        
        if(nums.length == 0){
            return true;
        }
        
//
//        if(nums.length == 0){
//            return true;
//        }
//

        int maxJump = nums[0];
        
        for(int i = 1; i < nums.length; i++){
          
            if(i > maxJump){
                return false;
            }
            
            maxJump = Math.max(maxJump, nums[i] + i);
            
        } 
        return true;
    }
}