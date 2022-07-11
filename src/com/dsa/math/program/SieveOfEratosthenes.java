package com.dsa.math.program;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        printNo(20);
    }

    private static void printNo(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // for (int j = 2 * i; j <= n; j += i) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int k = 2; k < isPrime.length; k++) {
            if (isPrime[k]) System.out.print(k + " ");
        }
    }
}
