package com.leetcode;
import java.util.*;
public class _384 {
    class Solution {

        int[] clone;
        int[] orignal;
        Random rnd;
        public Solution(int[] nums) {
            orignal = nums;
            clone = nums.clone();
            rnd = new Random();
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return orignal;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {

            int n = clone.length;
            for(int i = 0; i < clone.length; i++){
                int tmp = rnd.nextInt(n - i);
                swap(clone, i, tmp);
            }
            return clone;
        }

        private void swap(int[] arr, int left, int right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
}
