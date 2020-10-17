

import java.util.Arrays;

public class _06_DeleteDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 5, 7, 11, 11, 11, 13 };
        solve(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void solve(int[] arr) {

        int writeIndex = 1;

        int i = 1;
        while (i < arr.length) {
            if (arr[i] != arr[i - 1]) {
                arr[writeIndex++] = arr[i];
            }
            i++;
        }

        while (writeIndex < arr.length) {
            arr[writeIndex++] = 0;
        }
    }

}
