package com.leetcode;
import java.util.*;
public class _547 {
    class Solution {
        public int findCircleNum(int[][] M) {

            int n = M.length;

            UnionFind uf = new UnionFind(n);

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){

                    if(i != j && M[i][j] == 1){
                        uf.union(i, j);
                    }
                }
            }

            Set<Integer> set = new HashSet<>();

            for(int i = 0; i < uf.parent.length; i++){
                uf.parent[i] = uf.find(i);
                set.add(uf.parent[i]);
            }

            return set.size();
        }
    }

    class UnionFind{

        int[] height;
        int[] parent;

        public UnionFind(int n){
            height = new int[n];
            parent = new int[n];

            for(int i = 0; i < n; i++){
                height[i] = 1;
                parent[i] = i;
            }
        }

        public int find(int i){
            return parent[i] != i ? find(parent[i]) : parent[i];
        }

        public void union(int i, int j){
            int pi = find(i);
            int pj = find(j);

            if(height[pi] > height[pj]){
                parent[pj] = pi;
            }else if(height[pi] < height[pj]){
                parent[pi] = pj;
            }else{
                parent[pj] = pi;
                height[pi]++;
            }

        }

    }
}
