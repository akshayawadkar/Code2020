package com.leetcode;
public class _134 {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {

            int n = gas.length;

            int extra = 0, lacking = 0;

            int start = 0;

            for(int i = 0; i < gas.length; i++){

                extra = extra + (gas[i] - cost[i]);

                if(extra < 0){
                    start = i + 1;
                    lacking = lacking + extra;
                    extra = 0;
                }

            }

            return extra + lacking >= 0 ? start : -1;
        }
    }
}
