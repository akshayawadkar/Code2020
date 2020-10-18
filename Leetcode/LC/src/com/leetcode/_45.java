package com.leetcode;
public class _45 {
    class Solution {
        public int jump(int[] nums) {

            int n = nums.length;

            if(n == 1 || nums[0] == 0){
                return 0;
            }

            int jumps = 1;
            int furthestJump = nums[0];
            int currEnd = nums[0];


            for(int i = 1; i < n; i++){

                if(i == n - 1){
                    return jumps;
                }

                furthestJump = Math.max(furthestJump, nums[i] + i);

                if(currEnd == i){
                    currEnd = furthestJump;
                    jumps++;
                }



            }


            return jumps;
        }
    }
}
