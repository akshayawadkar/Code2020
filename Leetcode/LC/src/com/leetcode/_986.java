package com.leetcode;
import java.util.List;
import java.util.*;
public class _986 {

        public int[][] intervalIntersection(int[][] A, int[][] B) {


            List<int[]> result = new ArrayList<>();
            int a = 0, b = 0;

            while(a < A.length && b < B.length){

                int[] tmp = new int[2];
                if(B[b][1] >= A[a][0] && B[b][0] <= A[a][1]){
                    tmp[0] = Math.max(A[a][0], B[b][0]);
                    tmp[1] = Math.min(A[a][1], B[b][1]);
                }

                result.add(tmp);

                if(A[a][1] > B[b][1]){
                    b++;
                }else{
                    a++;
                }


            }


            return result.toArray(new int[result.size()][]);

        }

}
