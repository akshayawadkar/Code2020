package com.leetcode;

import java.util.*;

public class _1091 {
    class Solution {
        public int shortestPathBinaryMatrix(int[][] grid) {

            if(grid.length == 0 || grid == null || grid[0][0] == 1){
                return -1;
            }

            LinkedList<int[]> q = new LinkedList<>();
            q.add(new int[]{0, 0, 0});

            int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1},
                    {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};

            while(!q.isEmpty()){

                int size = q.size();

                for(int i = 0; i < size; i++){

                    int[] curr = q.poll();
                    int x = curr[0];
                    int y = curr[1];
                    int cost = curr[2];

                    if(x == grid.length - 1 && y == grid[0].length - 1){
                        return cost + 1;
                    }

                    for(int[] dir : dirs){

                        int newX = x + dir[0];
                        int newY = y + dir[1];

                        if(newX >= 0 && newX < grid.length
                                && newY >= 0 && newY < grid[0].length
                                &&  grid[newX][newY] == 0){
                            q.add(new int[]{newX, newY, cost + 1});
                            grid[newX][newY] = 1;
                        }


                    }
                }
            }

            return -1;
        }
    }
}
