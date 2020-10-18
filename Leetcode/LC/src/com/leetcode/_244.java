package com.leetcode;
import java.util.*;
public class _244 {
    class WordDistance {

        private Map<String, List<Integer>> map;
        public WordDistance(String[] words) {
            map = new HashMap<>();

            for(int i = 0; i < words.length; i++){
                String word = words[i];

                if(map.containsKey(word)){
                    map.get(word).add(i);
                }else{
                    map.put(word, new ArrayList<>());
                    map.get(word).add(i);
                }
            }
            System.out.println(map);
        }

        public int shortest(String word1, String word2) {

            List<Integer> l1 = map.get(word1);
            List<Integer> l2 = map.get(word2);

            int result = Integer.MAX_VALUE;

            int i = 0, j = 0;

            while(i < l1.size() && j < l2.size()){
                int idx1 = l1.get(i);
                int idx2 = l2.get(j);

                if(idx1 < idx2){
                    result = Math.min(result, idx2 - idx1);
                    i++;
                }else{
                    result = Math.min(result, idx1 - idx2);
                    j++;
                }

            }

            return result;
        }
    }

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */
}
