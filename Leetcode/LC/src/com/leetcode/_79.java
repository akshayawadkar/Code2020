package com.leetcode;
class _79 {
    public boolean exist(char[][] board, String word) {

        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){

                    if(dfs(i, j, board, word, 0, visited)){
                        return true;
                    }

                }
            }
        }
        return false;
    }

    private static boolean dfs(int i, int j, char[][] board, String word, int idx, boolean[][] visited){

        if(idx == word.length()){
            return true;
        }

        if(i < 0 || i >= board.length
                || j < 0 || j >= board[0].length){
            return false;
        }

        if(word.charAt(idx) != board[i][j]){
            return false;
        }

        if(visited[i][j]){
            return false;
        }

        visited[i][j] = true;

        if(dfs(i + 1, j, board, word, idx + 1, visited)
                || dfs(i - 1, j, board, word, idx + 1, visited)
                || dfs(i, j + 1, board, word, idx + 1, visited)
                || dfs(i, j - 1, board, word, idx + 1, visited)){
            return true;
        }

        visited[i][j] = false;
        return false;
    }
}