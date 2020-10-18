package com.leetcode;
import java.util.*;
public class _56 {

        public int[][] merge(int[][] intervals) {

            if(intervals.length == 0){
                return new int[][]{};
            }

            Arrays.sort(intervals, (a, b) ->{
                return a[0] - b[0];
            });

            List<int[]> result = new ArrayList<>();


            int[] prev = intervals[0];
            result.add(prev);

            for(int i = 1; i < intervals.length; i++){

                int[] curr = intervals[i];

                if(prev[1] >= curr[0]){
                    prev[1] = Math.max(prev[1], curr[1]);
                }else{
                    result.add(curr);
                    prev = curr;
                }
            }

            return result.toArray(new int[result.size()][]);
        }

}
