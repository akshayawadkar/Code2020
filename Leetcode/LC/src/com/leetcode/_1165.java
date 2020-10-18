package com.leetcode;
public class _1165 {

        public int calculateTime(String keyboard, String word) {

            int from = 0;
            int time = 0;

            for(char ch : word.toCharArray()){
                int curr = Math.abs(keyboard.indexOf(ch) - from);
                time += curr;
                from = keyboard.indexOf(ch);
            }

            return time;
        }

}
