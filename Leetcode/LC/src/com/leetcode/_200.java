package com.leetcode;
class _200 {
    public int numIslands(char[][] grid) {

        if(grid.length == 0 || grid[0].length == 0){
            return 0;
        }

        int m = grid.length, n = grid[0].length;
        int cnt = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    cnt += dfs(i, j, grid);
                }
            }
        }

        return cnt;
    }

    private int dfs(int i, int j, char[][] grid){

        if(i < 0 || i >= grid.length
                || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return 0;
        }


        grid[i][j] = '0';

        dfs(i + 1, j, grid);
        dfs(i - 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);

        return 1;
    }
}