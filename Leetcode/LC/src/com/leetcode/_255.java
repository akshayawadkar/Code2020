package com.leetcode;
import java.util.*;
import java.util.List;


public class _255 {

    public boolean verifyPreorder(int[] preorder) {

        int low = Integer.MIN_VALUE;

        Stack<Integer> stack = new Stack<>();

        for(int p : preorder){

            if(p < low){
                return false;
            }

            while(!stack.isEmpty() && p > stack.peek()){
                low = stack.pop();
            }

            stack.push(p);

        }
        return true;
    }
}

/*
* Consider this example
* [10,8,6,9,12,11,13]
*   this will return true;
*
* and if we change one value say we swap 9 with 6
*   this will return false;
*
*   because 9 is found to be this first small number and if it happens that we come till 6
*   it will compare 6 with 9 in this case 9 > 6 which is a wrong position
*   :. it will retunr false;
*
*   but it not swapped we can see that
*   6  would be the smallest no and nothing is greater than 6 in later traversal;
*
*
*
*
* */


