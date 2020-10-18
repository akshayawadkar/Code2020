package com.leetcode;
import java.util.Arrays;

public class _948 {

    class Solution {
        public int bagOfTokensScore(int[] tokens, int P) {


            Arrays.sort(tokens);
            int result = 0;
            int points = 0;

            int i = 0, j = tokens.length - 1;

            while(i <= j){
                if(P >= tokens[i]){
                    points++;
                    P -= tokens[i];
                    i++;
                    result = Math.max(result, points);
                }else if(points > 0){
                    points--;
                    P += tokens[j];
                    j--;
                }else{
                    return result;
                }
            }

            return result;
        }
    }
}
