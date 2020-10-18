package com.leetcode;
import java.util.*;
public class _354 {
    /*

A strict rule to be followed is
when you are sorting on

a[0][1] vs b[0][1]

if(a[0] == b[0]){
    return b[1] - a[1];
}

return a[0] - b[0];


if a situation arises like [4,5][4,6]

it should put [4,6] before [4,5] because

not doing that will consider 2 envoploes

but doing this will consider only one envolope


Consider this example:
[[4,5],[4,6],[6,7],[2,3],[1,1]]
*/


    class Solution {
        public int maxEnvelopes(int[][] envelopes) {
            return solve(envelopes);
        }

        private int solve(int[][] arr) {

            Arrays.sort(arr, (a, b) -> {
                // if(a[0] == b[0]){
                //     return b[1] - a[1];
                // }
                return a[0] - b[0];
            });


            for(int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }

            int n = arr.length;
            int[] dp = new int[n];
            int result = 0;

            for(int i = 0; i < n; i++) {
                int max = 0;
                for(int j = 0; j < i; j++) {

                    if(arr[i][1] > arr[j][1]) {
                        max = Math.max(max, dp[j]);
                    }

                }

                dp[i] = max + 1;

                result = Math.max(result, dp[i]);
            }


            return result;
        }
    }
}
