package com.leetcode;
public class _268 {
    class Solution {
        public int missingNumber(int[] nums) {

            int curr = 0, actual = 0;

            for(int i = 1; i <= nums.length; i++){
                actual += i;
                curr += nums[i - 1];
            }

            return actual - curr;
        }
    }
}
