package com.leetcode;
public class _26 {


        public int removeDuplicates(int[] nums) {

            if(nums.length == 0){
                return 0;
            }

            int writeIndex = 1;
            for(int i = 1; i < nums.length; i++){

                if(nums[i - 1] != nums[i]){
                    nums[writeIndex++] = nums[i];
                }

            }

            return writeIndex;

        }

}

