package com.leetcode;
import java.util.Map;
import java.util.*;
public class _1094 {
    class Solution {
        public boolean carPooling(int[][] trips, int capacity) {

            Map<Integer, Integer> map = new TreeMap<>();

            for(int[] trip : trips){
                map.put(trip[1], map.getOrDefault(trip[1], 0) + trip[0]);
                map.put(trip[2], map.getOrDefault(trip[2], 0) - trip[0]);
            }

            System.out.println(map);

            for(int v : map.values()){
                capacity = capacity - v;
                if(capacity < 0){
                    return false;
                }
            }
            System.out.println(capacity);
            return true;
        }
    }
}
