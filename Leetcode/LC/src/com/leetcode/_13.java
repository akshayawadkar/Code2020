package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _13 {
    public int romanToInt(String s) {
        
        if(s.length() == 0){
            return 0;
        }
        
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < s.length(); i++){
            
            if(i != 0 && map.get(s.charAt(i - 1)) < map.get(s.charAt(i))){
                result += map.get(s.charAt(i)) - (2 * map.get(s.charAt(i - 1)));
            }else{
                result += map.get(s.charAt(i));
            }
            
        }
        
        
        return result;
    }
}


/*

Two cases to focus on:
1) LVIII -> 58
    L -> V -> I -> I ->-> I  they all are in decreasing order



*/
