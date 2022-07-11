package com.dsa.bit;

public class CheckIfNoIsPowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(check(n));
    }

    private static boolean check(int n) {
        if ((n & n - 1) == 0)
            return true;
        return false;
    }
}
