package com.leetcode;
import java.util.*;
public class _449 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Codec {

        // // Encodes a tree to a single string.
        public String serialize(TreeNode root) {

            if(root == null){
                return "#";
            }

            String left = serialize(root.left);
            String right = serialize(root.right);

            return root.val + "," + left + "," + right;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            LinkedList<String> q = new LinkedList<>();
            q.addAll(Arrays.asList(data.split(",")));

            return bfs(q);
        }

        private TreeNode bfs(LinkedList<String> q){


            String curr = q.poll();

            if(curr.equals("#")){
                return null;
            }

            TreeNode root = new TreeNode(Integer.valueOf(curr));
            root.left = bfs(q);
            root.right = bfs(q);

            return root;
        }


    }
}
