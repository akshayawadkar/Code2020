package com.leetcode;
import java.util.*;
public class _215 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            return solve(nums, k);
        }
        private int solve(int[] arr, int k) {

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for(int i = 0; i < arr.length; i++) {

                pq.add(arr[i]);
                while(pq.size() > k) {
                    pq.poll();
                }

            }

            return pq.peek();
        }
    }
}
