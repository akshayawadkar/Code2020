package com.leetcode;
import java.util.*;
public class _448 {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {

            int n = nums.length;

            int i = 0;

            while(i < n){

                if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]){
                    swap(nums, i, nums[i] - 1);
                }else{
                    i++;
                }

            }

            System.out.println(Arrays.toString(nums));
            List<Integer> result = new ArrayList<>();

            for(i = 0; i < n; i++){
                if(i + 1 != nums[i]){
                    result.add(i + 1);
                }
            }


            return result;
        }

        public static void swap(int[] arr, int left, int right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }


    }
}
