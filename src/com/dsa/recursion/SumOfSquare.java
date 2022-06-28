package com.dsa.recursion;

public class SumOfSquare {
    public static void main(String[] args) {
        System.out.println(sum(8));
    }

    private static int sum(int n) {
        if (n == 0)
            return 0;
        return n * n + sum(n - 1);
    }
}
