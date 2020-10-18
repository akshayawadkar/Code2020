package com.leetcode;

import java.util.*;

public class _1 {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int sum = 9;

        System.out.println(Arrays.toString(twoSum(arr, sum)));
    }
}

