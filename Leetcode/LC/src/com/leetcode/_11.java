package com.leetcode;

public class _11 {
    public int maxArea(int[] height) {
        
        if(height.length == 0){
            return 0;
        }
        
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
            
        }
        
        return maxArea;
    }

    public static void main(String[] args) {

    }
}