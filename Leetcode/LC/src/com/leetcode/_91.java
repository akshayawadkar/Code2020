package com.leetcode;
class Solution {
    
    Integer[] dp;
    public int numDecodings(String s) {
        dp = new Integer[s.length() + 1];
        return solve(s, 0);
    }
    
    private int solve(String s, int curr){
        
        
        
        if(curr == s.length()){
            return 1;
        }
        
        if(s.charAt(curr) == '0'){
            return 0;
        }
        
         if(curr == s.length() - 1){
            return 1;
        }
       
        if(dp[curr] != null){
            return dp[curr];
        }
        
        
        int twoDigit = Integer.valueOf(s.substring(curr, curr + 2));
        
        
        int result = 0;
        result += solve(s, curr + 1);
        
        if(twoDigit <= 26){
            result += solve(s, curr + 2);
        }
        
        
        return dp[curr] = result;
    }
}
