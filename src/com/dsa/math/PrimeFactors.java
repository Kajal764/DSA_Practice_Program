package com.dsa.math;

public class PrimeFactors {
    public static void main(String[] args) {
        naiveWay(12);
    }

    // Time Complexity - O(n2logn)
    private static void naiveWay(int no) {
        for (int i = 2; i < no; i++) {
            if (isPrime(i)) {
                int x = i; // initialize another variable bcoz multiple of same no can also be factor
                while (no % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
