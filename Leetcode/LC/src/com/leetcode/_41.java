package com.leetcode;


import java.util.Arrays;

//First Missing Positive
public class _41 {

    public static int firstMissingPositive(int[] nums) {

        int i = 0, n = nums.length;

        while(i < n){
            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]){
                swap(nums, nums[i] - 1, i);
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        for(i = 0; i < n; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }

        return n + 1;

    }

    private static void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }


    public static void main(String[] args) {

        int[] arr = {-2, 11, 1, -3, 2, 10, 4};
        System.out.println(firstMissingPositive(arr));
    }

}
