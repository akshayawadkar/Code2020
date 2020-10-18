package com.leetcode;
import java.util.List;
import java.util.*;

public class _763 {

        public List<Integer> partitionLabels(String s) {

            int[] map = new int[26];

            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                map[ch - 'a'] = i;
            }

            System.out.println(Arrays.toString(map));

            List<Integer> result = new ArrayList<>();
            int i = 0;


            while(i < s.length()){

                int end = map[s.charAt(i) - 'a'];
                int j = i;
                while(j < end){
                    end = Math.max(end, map[s.charAt(j) - 'a']);
                    j++;
                }

                result.add(j - i + 1);
                i = end + 1;

            }



            return result;
        }

}
