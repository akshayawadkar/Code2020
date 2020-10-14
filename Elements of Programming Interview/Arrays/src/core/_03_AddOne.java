package core;

import java.util.Arrays;

public class _03_AddOne {

    public static void main(String[] args) {

        int[] arr = { 3, 9, 9 };
        int[] result = solve(arr);
        System.out.println(Arrays.toString(result));

    }

    private static int[] solve(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            } else {
                arr[i] = 0;
            }
        }

        int[] newArr = new int[arr.length + 1];
        newArr[0] = 1;
        arr = newArr;
        return newArr;

    }

}
