package com.leetcode;
import java.util.*;
public class _674 {

        public int findLengthOfLCIS(int[] nums) {

            if(nums.length == 0){
                return 0;
            }

            int max = 1;
            Set<Integer> set = new HashSet<>();

            int i = 0, j = 1;

            while(j < nums.length){
                if(nums[j - 1] < nums[j]){
                    max = Math.max(max, j - i + 1);
                }else{
                    i = j;
                }
                j++;
            }

            return max;
        }

}
