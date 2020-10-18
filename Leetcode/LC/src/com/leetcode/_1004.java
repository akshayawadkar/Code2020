package com.leetcode;
public class _1004 {
    class Solution {
        public int longestOnes(int[] nums, int K) {

            int left = 0, right = 0;
            int max = 0;


            while(right < nums.length){

                if(nums[right] == 0){
                    K--;
                }

                if(K < 0){

                    if(nums[left] == 0){
                        K++;
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
