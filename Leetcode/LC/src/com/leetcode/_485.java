package com.leetcode;
public class _485 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {

            int max = 0;
            int left = 0, right = 0;

            while(right < nums.length){

                if(nums[right] == 1){
                    max = Math.max(max, right - left + 1);
                }else{
                    left = right + 1;
                }

                right++;
            }

            return max;
        }
    }


}
