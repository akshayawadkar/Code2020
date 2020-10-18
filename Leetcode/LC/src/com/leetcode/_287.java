package com.leetcode;
import java.util.*;
public class _287 {
    class Solution {
        public int findDuplicate(int[] nums) {

            int n = nums.length;

            int i = 0;

            while(i < n){
                if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]){
                    swap(nums, nums[i] - 1, i);
                }else{
                    i++;
                }
            }

            System.out.println(Arrays.toString(nums));

            for(i = 0; i < n; i++){
                if(i + 1 != nums[i]){
                    return nums[i];
                }
            }

            return -1;

        }

        public void swap(int[] arr, int i, int j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
