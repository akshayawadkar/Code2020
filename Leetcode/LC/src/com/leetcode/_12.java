package com.leetcode;

public class _12 {
    public String intToRoman(int num) {
        
        String result = "";
        
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] generals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
         
        for(int i = 0; i < generals.length; i++){
            while(num >= generals[i]){
                  result += romans[i];
                  num -= generals[i]; 
            }
            
        }
      
        return result;
    }
} 