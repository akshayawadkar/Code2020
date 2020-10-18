package com.leetcode;
import java.util.*;
public class _455 {
	
    class Solution {
        public int findContentChildren(int[] g, int[] s) {

            Arrays.sort(g);
            Arrays.sort(s);


            int result = 0;
            int i = g.length - 1;
            int j = s.length - 1;

            while(i >= 0 && j >= 0){
                if(s[j] >= g[i]){
                    result++;
                    i--;
                    j--;
                }else{
                    i--;
                }
            }
            return result;
        }
    }
}
