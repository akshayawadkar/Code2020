package com.leetcode;
public class _338 {
    class Solution {
        public int[] countBits(int num) {

            int[] result = new int[num + 1];

            for(int i = 0; i <= num; i++){
                result[i] = solve(i);
            }

            return result;

        }
        private int solve(int n) {

            int numOfBits = 0;
            while(n != 0) {
                numOfBits += (n & 1);
                n = n >> 1;
            }
            return numOfBits;
        }
    }
}
