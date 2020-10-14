package core;

import java.util.Arrays;

public class _09_EnumerateAllPrimesToN {
    public static void main(String[] args) {

        int n = 18;

        boolean[] isPrime = new boolean[n + 1];
        isPrime[2] = false;
        isPrime[3] = false;
        isPrime[5] = false;
        isPrime[7] = false;
        
        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    isPrime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}