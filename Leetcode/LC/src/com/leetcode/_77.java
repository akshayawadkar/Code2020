package com.leetcode;
import java.util.*;

/*
* Understand the backtracking pattern
* i = 0 to n
* [1]
        * [1,2] /// it is always i + 1 i.e. if i = 1 next would start from i + 1 i.e 2
        * [1,3]
        * [1,4]
 *[2]
         *[2,3]
         *[2,4]
 *[3]
         *[3,4]
 *
 *
 *
* */


public class _77 {

         public static List<List<Integer>> solve(int n, int k){

            List<Integer> subList = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = i + 1;
            }

            helper(k, 0 , nums, subList, result);

            return result;
        }

        public static void helper(int k, int start , int[] nums,  List<Integer> subList, List<List<Integer>> result){


            if(subList.size() == k){
                result.add(new ArrayList<>(subList));
                return;
            }else{

                for(int i = start; i < nums.length; i++){
                    subList.add(nums[i]);
                    helper(k, i + 1, nums, subList, result);
                    subList.remove(subList.size() - 1);
                }


            }

        }


        public static void main(String[] args) {


            int n = 4, k = 2;
            System.out.println(solve(n, k));


        }


}
