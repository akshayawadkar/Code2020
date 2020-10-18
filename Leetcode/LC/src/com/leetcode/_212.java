package com.leetcode;
import java.util.*;

class Node{

    char val;
    Node[] children;
    String isWord;

    public Node(char val){
        this.val = val;
        this.children = new Node[26];
        this.isWord = null;
    }

}
class _212 {
    public List<String> findWords(char[][] board, String[] words) {
        if (board == null || board.length == 0) return new ArrayList<>();

        Node root = new Node(' ');
        for(String word : words){
            insert(root, word);
        }
        List<String> result = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){

                char ch = board[i][j];
                if(root.children[ch - 'a'] != null){
                    dfs(i, j, board, root, result);
                }
            }
        }

        return result;
    }

    private void dfs(int i, int j, char[][] board, Node root, List<String> result){

        if(i < 0 || i >= board.length
                || j < 0 || j >= board[0].length){
            return ;
        }

        if(board[i][j] == '#'){
            return;
        }

        char ch = board[i][j];
        int idx = ch - 'a';
        root = root.children[idx];
        if(root == null){
            return;
        }

        if(root.isWord != null){
            result.add(root.isWord);
            root.isWord = null;
        }
        board[i][j] = '#';
        dfs(i + 1, j, board, root, result);
        dfs(i - 1, j, board, root, result);
        dfs(i, j + 1, board, root, result);
        dfs(i, j - 1, board, root, result);

        board[i][j] = ch;

    }

    private void insert(Node root, String word){

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int idx = (int) ch - 'a';
            if(root.children[idx] == null)
                root.children[idx] = new Node(ch);
            root = root.children[idx];
        }
        root.isWord = word;

    }
}