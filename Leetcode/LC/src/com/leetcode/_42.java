package com.leetcode;
import java.util.Stack;

public class _42 {


    /*
    * Consider the exmaple
    *
    * 2 1 0 2 and the result should be 3
    * */




        public int trap(int[] height) {

            if(height.length == 0){
                return 0;
            }

            int totalWaterCollected = 0;

            Stack<Integer> stack = new Stack<>();
            int i = 0;

            while(i < height.length){

                while(!stack.isEmpty() && height[i] >= height[stack.peek()]){
                    int top = stack.pop();

                    if(stack.isEmpty()){
                        break;
                    }

                    int curr_height = Math.min(height[i], height[stack.peek()]) - height[top];
                    int curr_width = i - stack.peek() - 1;
                    totalWaterCollected += (curr_height * curr_width);
                }
                stack.push(i);
                i++;

            }
            return totalWaterCollected;
        }

}
