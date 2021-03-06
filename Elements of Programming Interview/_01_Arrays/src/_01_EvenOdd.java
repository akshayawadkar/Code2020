

import java.util.Arrays;

public class _01_EvenOdd {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        solve(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void solve(int[] arr) {

        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else {
                swap(arr, left, right--);
            }
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}