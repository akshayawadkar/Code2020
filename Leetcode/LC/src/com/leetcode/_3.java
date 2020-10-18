package com.leetcode;

import java.util.*;

public class _3 {

    public static void main(String[] args) {
     
        String ip = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(ip));
    }


    public static int lengthOfLongestSubstring(String s) {

        if(s.length() == 0 || s == null){
            return 0;
        }

        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        int maxL = 0;

        while(right < s.length()){
            char ch = s.charAt(right);
            if(set.contains(ch)){
                set.remove(s.charAt(left++));
            }else{
                set.add(ch);
                maxL = Math.max(maxL, set.size());
                right++;
            }
        }

        return maxL;
    }
}
