package com.leetcode;
public class _209 {

        public int minSubArrayLen(int s, int[] nums) {

            int minSize = Integer.MAX_VALUE;

            int left = 0, right = 0;
            int sum = 0;
            while(right < nums.length){
                sum += nums[right];

                while(sum >= s){
                    minSize = Math.min(minSize, right - left + 1);
                    sum -= nums[left++];
                }
                right++;
            }


            return minSize == Integer.MAX_VALUE ? 0 : minSize;
        }
}
