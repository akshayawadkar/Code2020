package com.leetcode;

public class _14 {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0){
            return"";
        }
        
        String result = ""; 
        int index = 0;
        
        for(char ch : strs[0].toCharArray()){
            for(int i = 1; i < strs.length; i++){
                if(index >= strs[i].length() || ch != strs[i].charAt(index)){
                    return result;
                }
            }
            result += ch;
            index++;
        }
        
        
        return result;
    }

    public static void main(String[] args) {


    }
}