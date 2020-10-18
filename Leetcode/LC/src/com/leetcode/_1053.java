package com.leetcode;
public class _1053 {
    class Solution {
        public int[] prevPermOpt1(int[] A) {

            int i = A.length - 2;

            while(i >= 0){
                if(A[i] > A[i + 1]){
                    break;
                }
                i--;
            }

            // System.out.println(A[i]);

            if(i == -1){
                return A;
            }

            int j = A.length - 1;

            while(j > i){
                if(A[j] < A[i] && A[j] != A[j - 1]){
                    swap(A, i, j);
                    break;
                }
                j--;
            }



            return A;
        }


        private void swap(int[] arr, int left, int right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}
