package com.leetcode;
import java.util.*;


public class _967 {

        public int[] numsSameConsecDiff(int N, int K) {
            return solve(N, K);
        }

        private static int[] solve(int N, int K){

            if(N == 1){
                return new int[]{0,1,2,3,4,5,6,7,8,9};
            }

            List<Integer> res = new ArrayList<>();

            for(int i = 1; i <= 9; i++){
                dfs(N, K, i, 0, i, res);
            }

            int[] result = new int[res.size()];
            int idx = 0;
            for(int i: res){
                result[idx++] = i;
            }
            return  result;
        }

        private static void dfs(int N, int K, int curr, int i, int prev, List<Integer> res) {


            if(i == N - 1){
                res.add(curr);
                return;
            }

            int next = prev + K;
            if(next < 10){
                dfs(N, K, (curr * 10) + next, i + 1, next, res);
            }

            next = prev - K;

            if(K != 0 && next >= 0){
                dfs(N, K, (curr * 10) + next, i + 1, next, res);
            }
        }

}
