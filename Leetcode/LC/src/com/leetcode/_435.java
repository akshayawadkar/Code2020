package com.leetcode;
import java.util.Arrays;

public class _435 {

        public int eraseOverlapIntervals(int[][] intervals) {

            Arrays.sort(intervals, (a, b) ->{
                return a[0] - b[0];
            });

            int count = 0;

            int left = 0, right = 1;
            while(right < intervals.length){

                if(intervals[left][1] <= intervals[right][0]){
                    left = right;
                    right++;
                }else if(intervals[left][1] <= intervals[right][1]){
                    count++;
                    right++;
                }else if(intervals[left][1] > intervals[right][1]){
                    count++;
                    left = right;
                    right++;
                }

            }

            return count;
        }

}
