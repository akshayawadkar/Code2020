package com.leetcode;
import java.util.*;
public class _300 {

        public int lengthOfLIS(int[] arr) {

            if (arr.length == 0) {
                return 0;
            }

            int[] dp = new int[arr.length];
            Arrays.fill(dp, 1);
            int max = 1;

            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                max = Math.max(max, dp[i]);
            }

            return max;

        }


}
