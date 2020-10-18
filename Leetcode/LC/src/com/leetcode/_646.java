package com.leetcode;
import java.util.*;
public class _646 {
    class Solution {
        public int findLongestChain(int[][] pairs) {

            Arrays.sort(pairs, (a, b) ->{
                return a[0] - b[0];
            });

            int n = pairs.length;
            int result = 0;

            int[] dp = new int[n];


            for(int i = 0; i < n; i++){
                int max = 0;
                for(int j = 0; j < i; j++){
                    if(pairs[j][1] < pairs[i][0]){
                        max = Math.max(max, dp[j]);
                    }
                }

                dp[i] = max + 1;
                result = Math.max(result, dp[i]);
            }

            System.out.println(Arrays.toString(dp));

            return result;
        }
    }
}
