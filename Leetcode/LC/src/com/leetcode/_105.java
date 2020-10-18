package com.leetcode;

public class _105 {
     
    int idx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder, inorder, 0, inorder.length - 1); 
    }
    
    private TreeNode dfs(int[] pre, int[] in, int start, int end){
        if(start > end){
            return null;
        }
        
        TreeNode curr = new TreeNode(pre[idx++]);
        int index = indexOf(curr.val, in);
        curr.left = dfs(pre, in, start, index - 1);
        curr.right = dfs(pre, in, index + 1, end);
        
        return curr;
    }
    
    
    private int indexOf(int key, int[] in){
        for(int i = 0; i < in.length; i++){
            if(in[i] == key){
                return i;
            }
        }
        
        return - 1;
    }
}