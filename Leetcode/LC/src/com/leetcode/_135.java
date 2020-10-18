package com.leetcode;
import java.util.*;
public class _135 {

        public int candy(int[] ratings) {

            int n = ratings.length;

            int[] candies_left = new int[n];
            int[] candies_right = new int[n];

            Arrays.fill(candies_left, 1);
            Arrays.fill(candies_right, 1);


            for(int i = 1; i < ratings.length; i++){
                if(ratings[i] > ratings[i - 1]){
                    candies_left[i] = candies_left[i - 1] + 1;
                }
            }

            for(int i = ratings.length - 2; i >= 0; i--){
                if(ratings[i] > ratings[i + 1]){
                    candies_right[i] = candies_right[i + 1] + 1;
                }
            }

//         System.out.println(Arrays.toString(candies_left));
//         System.out.println(Arrays.toString(candies_right));

            int result = 0;
            for(int i = 0; i < ratings.length; i++){
                result += Math.max(candies_left[i], candies_right[i]);
            }


            return result;
        }
    }

