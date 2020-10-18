package com.leetcode;
import java.util.HashMap;
import java.util.Map;

public class _409 {

        public int longestPalindrome(String s) {

            Map<Character, Integer> map = new HashMap<>();
            for(char ch : s.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            int ans = 0;
            boolean isFirstOdd = true;

            for(Character ch : map.keySet()){
                if(map.get(ch) % 2 == 0){
                    ans += map.get(ch);
                }else{
                    if(isFirstOdd){
                        isFirstOdd = false;
                        ans += map.get(ch);
                    }else{
                        ans += map.get(ch) - 1;
                    }

                }
            }



            return ans;
        }

}
