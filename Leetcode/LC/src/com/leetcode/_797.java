package com.leetcode;
import java.util.*;
public class _797 {
    class Solution {
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

            List<Integer> subList = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            int src = 0, dest = graph.length - 1;
            subList.add(src);
            dfs(subList, result, graph, src, dest);

            return result;
        }

        private void dfs(List<Integer> subList, List<List<Integer>> result, int[][] graph, int src,int dest){

            if(src == dest){
                result.add(new ArrayList<>(subList));
                return;
            }

            for(int i : graph[src]){
                subList.add(i);
                dfs(subList, result, graph, i, dest);
                subList.remove(subList.size() - 1);
            }
        }
    }
}
