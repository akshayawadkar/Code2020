

import java.util.Arrays;

public class _02_DutchNationalFlag {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 0, 2, 1, 1 };
        solve(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void solve(int[] arr){

        int left = 0, right = arr.length - 1;
        int curr = 0;

        while(curr <= right){
            if(arr[curr] == 0){
                swap(arr, left, curr);
                left++;
                curr++;
            }else if(arr[curr] == 1){
                curr++;
            }else{
                swap(arr, curr, right);
                right--;
            }
        }
    }

    private static void swap(int[] arr, int left, int right){
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
