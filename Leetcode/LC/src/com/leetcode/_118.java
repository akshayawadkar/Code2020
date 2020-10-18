package com.leetcode;
import java.util.*;
public class _118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {

            List<List<Integer>> result = new ArrayList<>();
            List<Integer> subList = new ArrayList<>();
            if(numRows == 0){
                return result;
            }

            subList.add(1);
            result.add(new ArrayList<>(subList));

            if(numRows == 1){
                return result;
            }



            for(int i = 2; i <= numRows; i++){

                subList = new ArrayList<>();
                for(int j = 1; j <= i; j++){
                    subList.add(1);
                }
                // System.out.println(result.get(result.size() - 1));
                List<Integer> prev = result.get(result.size() - 1);

                for(int j = 1; j < i - 1; j++){
                    subList.set(j, prev.get(j - 1) + prev.get(j));
                }
                result.add(new ArrayList<>(subList));
            }
            return result;
        }
    }
}
