package com.dsa.math.program;

public class CheckIsPrime {
    public static void main(String[] args) {
        System.out.println(isPrimeMoreEfficient(25));
    }

    private static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

        //Time Complexity O((n))
    }

    private static boolean isPrimeEfficient(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    //Time Complexity O(sqrt(n))

    private static boolean isPrimeMoreEfficient(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i+=6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
