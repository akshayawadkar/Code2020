package com.leetcode;
import java.util.*;
public class _611 {
    class Solution {
        public int triangleNumber(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            Arrays.sort(nums);
            int triplets = 0;
            for (int i = 2; i < nums.length; i++) {
                int left = 0;
                int right = i - 1;
                while (left < right) {
                    if (nums[i] < nums[left] + nums[right]) {
                        triplets += (right - left);
                        right--;
                    } else {
                        left++;
                    }
                }
            }
            return triplets;
        }
    }
}
