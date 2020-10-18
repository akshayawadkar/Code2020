package com.leetcode;

public class _106 {

    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length - 1;
        return dfs(postorder, inorder, 0, inorder.length - 1); 
    }
    
    private TreeNode dfs(int[] post, int[] in, int start, int end){
        if(start > end){
            return null;
        }
        
        TreeNode curr = new TreeNode(post[idx--]);
        int index = indexOf(curr.val, in);
        curr.right = dfs(post, in, index + 1, end);
        curr.left = dfs(post, in, start, index - 1); 
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