package com.leetcode;
import java.util.*;
public class _63 {
    class Solution {
        int[][] dp;
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;

            dp = new int[m + 1][n + 1];

            for(int[] ar : dp){
                Arrays.fill(ar, -1);
            }


            return helper(m - 1, n - 1, obstacleGrid);
        }

        private int helper(int m, int n, int[][] grid){

            if(m < 0 || n < 0){
                return 0;
            }

            if(grid[m][n] == 1){
                return 0;
            }

            if(m == 0 && n == 0){
                return 1;
            }

            if(dp[m][n] != -1){
                return  dp[m][n];
            }


            return dp[m][n] = helper(m - 1, n, grid) + helper(m, n - 1, grid);
        }
    }
}
