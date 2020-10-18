package com.leetcode;

import java.util.*;

public class _111 {

    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);

        int height = 1;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();

                if(curr.left == null && curr.right == null){
                    return height;
                }

                if(curr.left != null){
                    q.add(curr.left);
                }


                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            height++;
        }

        return height;
    }
}
