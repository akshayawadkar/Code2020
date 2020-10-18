package com.leetcode;
import java.util.*;

public class _230 {

    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while(!stack.isEmpty() || curr != null){

            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if(--k == 0){
                return curr.val;
            }
            curr = curr.right;


        }

        return 0;
    }
}
