package com.leetcode;
public class _487 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {

            int left = 0, right = 0;
            int max = 0;
            int k = 1;
            while(right < nums.length){

                if(nums[right] == 0){
                    k--;
                }

                while(k < 0){
                    if(nums[left] == 0){
                        k++;
                    }
                    left++;
                }

                max = Math.max(max, right - left + 1);
                right++;
            }

            return max;
        }
    }
}
