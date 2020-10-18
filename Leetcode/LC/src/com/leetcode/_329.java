package com.leetcode;
class _329 {
    public int longestIncreasingPath(int[][] matrix) {

        if(matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }


        int m = matrix.length, n = matrix[0].length;

        int[][] dp = new int[m][n];

        int result = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(dp[i][j] == 0){

                    dfs(i, j, matrix, dp, Integer.MIN_VALUE);

                    result = Math.max(result, dp[i][j]);
                }
            }
        }

        return result;
    }

    private int dfs(int i, int j, int[][] matrix, int[][] dp, int prev){

        if(i < 0 || i >= matrix.length
                || j < 0 || j >= matrix[0].length){
            return 0;
        }

        if(prev >= matrix[i][j]){
            return 0;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }


        int left = dfs(i, j - 1, matrix, dp, matrix[i][j]);
        int right = dfs(i, j + 1, matrix, dp, matrix[i][j]);
        int up = dfs(i - 1, j, matrix, dp, matrix[i][j]);
        int down = dfs(i + 1, j, matrix, dp, matrix[i][j]);


        dp[i][j] = getMax(left, right, up, down) + 1;
        return dp[i][j];
    }

    private int getMax(int i, int j, int k, int l){
        return Math.max(i, Math.max(j, Math.max(k, l)));
    }
}