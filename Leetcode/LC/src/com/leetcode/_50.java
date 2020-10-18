package com.leetcode;
import java.util.*;
public class _50 {
    class Solution {
        public double myPow(double x, int n) {

            if(n < 0){
                return 1 / solve(x, n);
            }else{
                return solve(x, n);
            }
        }

        private double solve(double x, int y) {

            if(y == 0) {
                return 1;
            }

            double rec = solve(x, y / 2);

            double result = rec * rec;

            if(y % 2 != 0) {
                result = result * x;
            }
            return result;
        }

    }
}
