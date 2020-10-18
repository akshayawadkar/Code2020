package com.leetcode;
import java.util.Arrays;
import java.util.PriorityQueue;

public class _253 {

        public int minMeetingRooms(int[][] intervals) {


            if(intervals.length == 0){
                return 0;
            }

            Arrays.sort(intervals, (a, b)->{
                return a[0] - b[0];
            });

            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
                return a[1] - b[1];
            });

            pq.add(intervals[0]);

            for(int i = 1; i < intervals.length; i++){
                int[] prev = pq.poll();
                int[] curr = intervals[i];

                if(curr[0] >= prev[1]){
                    prev[1] = curr[1];
                }else{
                    pq.add(curr);
                }

                pq.add(prev);
            }

            return pq.size();
        }
    }

