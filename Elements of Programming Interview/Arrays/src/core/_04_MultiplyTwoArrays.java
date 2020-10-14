package core;

import java.util.Arrays;

public class _04_MultiplyTwoArrays {

    public static void main(String[] args) {

        int[] num1 = { -1, 9, 3, 7, 0, 7, 7, 2, 1 };
        int[] num2 = { -7, 6, 1, 8, 3, 8, 2, 5, 7, 2, 8, 7 };

        int[] result = solve(num1, num2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solve(int[] num1, int[] num2) {

        boolean flag1 = num1[0] < 0 ? true : false;
        boolean flag2 = num2[0] < 0 ? true : false;
        int sign = 1;

        if (flag1 && flag2) {
            num1[0] = num1[0] * -1;
            num2[0] = num2[0] * -1;
        } else if (flag1) {
            sign = -1;
            num1[0] = num1[0] * -1;
        } else if (flag2) {
            sign = -1;
            num2[0] = num2[0] * -1;
        }

        int m = num1.length;
        int n = num2.length;
        int[] values = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                int mul = num1[i] * num2[j];
                int sum = values[i + j + 1] + mul;

                values[i + j + 1] = sum % 10;
                values[i + j] = values[i + j] + (sum / 10);

            }
        }

        if (sign == -1) {
            values[0] = values[0] * -1;
        }

        System.out.println(Arrays.toString(values));

        return null;
    }

}
