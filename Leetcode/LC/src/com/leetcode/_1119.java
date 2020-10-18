package com.leetcode;
class _1119 {
    public String removeVowels(String s) {

        char[] arr = s.toCharArray();
        int writeIndex = 0;
        String vow = "aeiou";

        for(int i = 0; i < arr.length; i++){
            String tmp = arr[i] +"";
            if(!vow.contains(tmp)){
                arr[writeIndex++] = arr[i];
            }
        }

        String result = new String(arr);
        result.substring(0, writeIndex);
        return result;
    }


}