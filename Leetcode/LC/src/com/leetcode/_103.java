package com.leetcode;

import java.util.*;

public class _103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }


        List<List<Integer>> result = new ArrayList<>();

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);


        while(!stack1.isEmpty() || !stack2.isEmpty()){

            List<Integer> subList = new ArrayList<>();

            while(!stack1.isEmpty()){
                TreeNode curr = stack1.pop();
                if(curr.left != null){
                    stack2.push(curr.left);
                }

                if(curr.right != null){
                    stack2.push(curr.right);
                }


                subList.add(curr.val);
            }

            if(subList.size() > 0){
                result.add(new ArrayList<>(subList));
                subList.clear();
            }
            while(!stack2.isEmpty()){
                TreeNode curr = stack2.pop();
                if(curr.right != null){
                    stack1.push(curr.right);
                }
                if(curr.left != null){
                    stack1.push(curr.left);
                }
                subList.add(curr.val);
            }

            if(subList.size() > 0){
                result.add(new ArrayList<>(subList));
                subList.clear();
            }

        }

        return result;
    }
}
