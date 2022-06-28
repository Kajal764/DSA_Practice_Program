package com.dsa.recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println(findGCD(44, 60));
    }

    private static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}

//Time complexity - O(log(min(a, b))