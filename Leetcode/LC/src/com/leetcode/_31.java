package com.leetcode;

public class _31 {
    public void nextPermutation(int[] nums) {
        
        int i = nums.length - 2;
        
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        
        if(i == -1){
            reverse(nums, 0, nums.length - 1);
            return;
        }
        
        int k = nums.length - 1;
        
        while(k > i){
            if(nums[k] > nums[i]){
                break;
            }
            k--;
        }
        System.out.println(i+ " " + k);
        
        swap(nums, i, k);
        reverse(nums, i + 1, nums.length - 1);
        
        System.out.println("here");
        
    }
    
    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    private void reverse(int[] nums, int i, int j){
         
         while(i < j){
             int tmp = nums[i];
             nums[i] = nums[j];
             nums[j] = tmp;
             i++;
             j--;
         }
     }
}