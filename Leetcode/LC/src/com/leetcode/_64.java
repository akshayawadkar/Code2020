package com.leetcode;
import java.util.*;
public class _64 {
    int[][] dp;
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        dp = new int[m + 1][n + 1];

        for(int[] ar : dp){
            Arrays.fill(ar, -1);
        }

        return helper(grid, m - 1, n - 1);
    }

    private int helper(int[][] grid, int m, int n){

        if(m < 0 || n < 0){
            return Integer.MAX_VALUE;
        }

        if(m == 0 && n == 0){
            return grid[m][n];
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }

        return dp[m][n] = Math.min(helper(grid, m - 1, n), helper(grid, m, n - 1)) + grid[m][n];
    }
}
