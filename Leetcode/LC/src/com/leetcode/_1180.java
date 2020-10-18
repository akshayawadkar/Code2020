package com.leetcode;
public class _1180 {


        public int countLetters(String s) {


            if(s.length() == 0){
                return 0;
            }

            int result = 0;
            char prevChar = s.charAt(0);
            int rep = 0;
            for(int i = 0; i < s.length(); i++){
                char currChar = s.charAt(i);
                if(prevChar == currChar){
                    rep++;
                }else{
                    rep = 1;
                }

                result += rep;
                prevChar = currChar;

            }

            return result;
        }

}
