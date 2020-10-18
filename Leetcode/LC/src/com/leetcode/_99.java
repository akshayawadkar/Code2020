package com.leetcode;
public class _99 {
    
    TreeNode first, second;
    TreeNode prev;
    
    private void dfs(TreeNode root){
        
        if(root != null){
            dfs(root.left);
            
            if(prev != null){
                
                if(prev.val > root.val){
                    if(first == null){
                        first = prev;
                    }
                    second = root;
                }
                
            }
            prev = root;
            dfs(root.right);
        }
        
    }
    
    public void recoverTree(TreeNode root) {
        
        dfs(root);
        
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp; 
    }
}