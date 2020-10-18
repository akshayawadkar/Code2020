package com.leetcode;

import java.util.Arrays;

public class _746 {

    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int m = cost.length;
        dp = new int[m + 1];
        Arrays.fill(dp, - 1);
        return Math.min(helper(cost, m - 1), helper(cost, m - 2));
    }

    private int helper(int[] cost, int m){

        if(m < 0){
            return Integer.MAX_VALUE;
        }

        if(m <= 1){
            return cost[m];
        }

        if(dp[m] != -1){
            return dp[m];
        }

        return dp[m] = Math.min(helper(cost,m - 1), helper(cost, m - 2)) + cost[m];
    }
}
