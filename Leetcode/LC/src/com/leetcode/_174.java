package com.leetcode;

import java.util.Arrays;

public class _174 {


        int[][] dp;
        public int calculateMinimumHP(int[][] dungeon) {

            dp = new int[dungeon.length + 1][dungeon[0].length];
            for(int[] ar : dp){
                Arrays.fill(ar, -1);
            }
            return helper(0, 0, dungeon);
        }

        private int helper(int m, int n, int[][] grid){

            if(m >= grid.length || n >= grid[0].length){
                return Integer.MAX_VALUE;
            }

            if(dp[m][n] != -1){
                return dp[m][n];
            }

            int down = helper(m + 1, n, grid);
            int right = helper(m, n + 1, grid);

            int health = Math.min(down, right);

            if(health == Integer.MAX_VALUE){
                health = 1;
            }

            int result = 0;

            if(health - grid[m][n] > 0){
                result = health - grid[m][n];
            }else{
                result = 1;
            }

            return dp[m][n] = result;
        }

}
