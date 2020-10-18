package com.leetcode;
import java.util.*;
public class _159 {

    public int lengthOfLongestSubstringTwoDistinct(String s) {

        if(s.length() == 0){
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int max = 0;
        while(right < s.length()){



            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
            }else{
                map.put(s.charAt(right), 1);
            }

            if(map.size() <= 2 ){
                max = Math.max(max, right - left + 1);
            }else{
                char tmp = s.charAt(left);
                int val = map.get(tmp);

                if(val == 1){
                    map.remove(tmp);
                }else{
                    map.put(tmp, val - 1);
                }
                left++;
            }


            right++;

        }
        return max;
    }

}

