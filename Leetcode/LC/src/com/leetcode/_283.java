package com.leetcode;
public class _283 {

        public void moveZeroes(int[] nums) {
            int writeIndex = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    nums[writeIndex++] = nums[i];
                }
            }

            for(int i = writeIndex; i < nums.length; i++){
                nums[i] = 0;
            }
        }

}
