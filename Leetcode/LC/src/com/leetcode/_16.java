package com.leetcode;

import java.util.Arrays;

public class _16 {
    public int threeSumClosest(int[] nums, int target) {
        
        int sum = 0, diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int j = i + 1, k = nums.length - 1;

            while(j < k){

                int currSum = nums[i] + nums[j] + nums[k];
                int currDiff = Math.abs(currSum - target);
                
                if(currDiff < diff){
                    diff = currDiff;
                    sum = currSum;
                }
                
                if(currSum > target){
                    k--;
                }else{
                    j++;
                }
                
            }
            
        }
        
        return sum;
        
    }


    public static void main(String[] args) {

    }
}