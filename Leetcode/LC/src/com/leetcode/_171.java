package com.leetcode;
public class _171 {

        public int titleToNumber(String s) {


            if(s.length() == 0){
                return 0;
            }

            int result = 0;
            int p = 0;
            for(int i = s.length() - 1; i >= 0; i--){

                char ch = s.charAt(i);
                int ascii = (int) ch - 65 + 1;

                result += Math.pow(26, p++) * ascii;

            }

            return result;
        }
}
